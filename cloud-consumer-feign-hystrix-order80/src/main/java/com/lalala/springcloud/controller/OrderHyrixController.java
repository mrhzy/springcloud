package com.lalala.springcloud.controller;

import com.lalala.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderHyrixController
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-05 11:41
 * @Version V1.0.0
 */
@RestController
@Slf4j
//@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHyrixController {

  @Resource
  private PaymentHystrixService paymentHystrixService;

  /**
   * 正常访问
   *
   * @param id
   * @return
   */
  @GetMapping("/consumer/payment/hystrix/ok/{id}")
  public String paymentInfoOk(@PathVariable("id") Integer id) {
    String result = paymentHystrixService.paymentInfoOK(id);
    log.info("*****result:" + result);

    return result;
  }

  /**
   * 超时访问
   *
   * @param id
   * @return
   */
  @GetMapping("/consumer/payment/hystrix/timeout/{id}")
  //@HystrixCommand(fallbackMethod = "paymentInfoTimeoutFallbackMethod", commandProperties = {
  //    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
  //})
  //@HystrixCommand
  public String paymentInfoTimeout(@PathVariable("id") Integer id) {

    //int i = 10 / 0;
    String result = paymentHystrixService.paymentInfoTimeOut(id);
    log.info("*****result:" + result);

    return result;
  }

  public String paymentInfoTimeoutFallbackMethod(Integer id) {

    return "我是消费者80，对方支付系统繁忙请10秒钟再试或者自己运行出错请检查自己， (┬＿┬)~~";
  }

  /**
   * 全局fallback
   *
   * @return
   */
  public String payment_Global_FallbackMethod() {
    return "Global异常处理信息,请稍后重试.o(╥﹏╥)o";
  }
}
