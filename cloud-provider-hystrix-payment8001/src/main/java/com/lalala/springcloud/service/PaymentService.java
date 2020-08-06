package com.lalala.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName PaymentService
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-05 11:03
 * @Version V1.0.0
 */
@Service
public class PaymentService {

  /**
   * 正常访问，肯定OK
   *
   * @param id
   * @return
   */
  public String paymentInfoOk(Integer id) {

    return "线程池：" + Thread.currentThread().getName() + "paymentInfoOk, id：" + id + "\t o(∩_∩)o 哈哈~";
  }


  @HystrixCommand(fallbackMethod = "paymentInfoTimeoutHandler", commandProperties = {
      @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
  })
  public String paymentInfoTimeout(Integer id) {

    //暂停毫秒
    try {
      TimeUnit.MILLISECONDS.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    return "线程池：" + Thread.currentThread().getName() + ", id：" + id + "\t o(∩_∩)o 哈哈~ 耗时(秒)：";
  }

  public String paymentInfoTimeoutHandler(Integer id) {

    return "线程池：" + Thread.currentThread().getName() + "系统繁忙或者运行报错，请稍后重试, id：" + id + "\t (┬＿┬)~~";
  }

  //=============服务熔断
  @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
      @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
      @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
      @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
      @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
  })
  public String paymentCircuitBreaker(Integer id) {

    if (id < 0) {
      throw new RuntimeException("******id不能负数");
    }
    String serialNumber = IdUtil.simpleUUID();


    return Thread.currentThread().getName() + "\t 调用成功，流水号：" + serialNumber;
  }

  public String paymentCircuitBreaker_fallback(Integer id) {

    return "id不能负数，请稍后再试，/(┬＿┬)/~~~";
  }
}
