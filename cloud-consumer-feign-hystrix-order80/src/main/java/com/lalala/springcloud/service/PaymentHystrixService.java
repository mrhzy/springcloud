package com.lalala.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName PaymentHystrixService
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-05 11:39
 * @Version V1.0.0
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {

  /**
   * 正常访问
   *
   * @param id
   * @return
   */
  @GetMapping("/payment/hystrix/ok/{id}")
  String paymentInfoOK(@PathVariable("id") Integer id);

  /**
   * 超时访问
   *
   * @param id
   * @return
   */
  @GetMapping("/payment/hystrix/timeout/{id}")
  String paymentInfoTimeOut(@PathVariable("id") Integer id);

}