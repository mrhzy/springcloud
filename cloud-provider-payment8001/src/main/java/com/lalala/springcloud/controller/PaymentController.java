package com.lalala.springcloud.controller;

import com.lalala.springcloud.entities.CommonResult;
import com.lalala.springcloud.entities.Payment;
import com.lalala.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName PaymentController
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-03 13:20
 * @Version V1.0.0
 */
@RestController
@Slf4j
public class PaymentController {

  @Resource
  private PaymentService paymentService;

  @Value("${server.port}")
  private String serverPort;

  @Resource
  private DiscoveryClient discoveryClient;

  @PostMapping(value = "/payment/create")
  public CommonResult create(@RequestBody Payment payment) {

    int result = paymentService.create(payment);

    log.info("*****插入结果：{}", result);

    if (result > 0) {
      return new CommonResult(200, "插入数据库成功,serverPort：" + serverPort, result);
    } else {
      return new CommonResult(444, "插入数据库失败");
    }
  }

  @GetMapping(value = "/payment/get/{id}")
  public CommonResult<Payment> get(@PathVariable Long id) {

    Payment payment = paymentService.getPaymentById(id);

    log.info("*****查询结果：{}", payment);

    if (payment != null) {
      return new CommonResult(200, "查询成功,serverPort：" + serverPort, payment);
    } else {
      return new CommonResult(444, "没有对应记录，查询ID：" + id);
    }
  }

  @GetMapping(value = "/payment/discovery")
  public Object discovery() {

    List<String> services = discoveryClient.getServices();

    for (String element : services) {
      log.info("******element：" + element);
    }

    List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");

    for (ServiceInstance instance : instances) {
      log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());

    }

    return this.discoveryClient;
  }

  @GetMapping(value = "/payment/lb")
  public String getPaymentLB() {
    return serverPort;
  }

  @GetMapping(value = "/payment/feign/timeout")
  public String feignTimeout() {
    try { Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
    return serverPort;
  }

  @GetMapping(value = "/payment/zipkin")
  public String paymentZipkin() {

    return "hi, I'm payment zipkin server fall back, welcome to here,o(∩_∩)o 哈哈~";
  }
}
