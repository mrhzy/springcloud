package com.lalala.springcloud.controller;

import com.lalala.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.internal.constraintvalidators.bv.time.past.PastValidatorForYear;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName PaymentHystrixController
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-05 11:02
 * @Version V1.0.0
 */
@RestController
@Slf4j
public class PaymentHystrixController {

  @Resource
  private PaymentService paymentService;

  @Value("${server.port}")
  private String serverPort;

  /**
   * 正常访问
   *
   * @param id
   * @return
   */
  @GetMapping("/payment/hystrix/ok/{id}")
  public String paymentInfoOk(@PathVariable("id") Integer id) {
    String result = paymentService.paymentInfoOk(id);
    log.info("*****result:" + result);

    return result;
  }

  /**
   * 超时访问
   *
   * @param id
   * @return
   */
  @GetMapping("/payment/hystrix/timeout/{id}")
  public String paymentInfoTimeout(@PathVariable("id") Integer id) {
    String result = paymentService.paymentInfoTimeout(id);
    log.info("*****result:" + result);

    return result;
  }

  /**
   * 超时访问
   *
   * @param id
   * @return
   */
  @GetMapping("/payment/circuit/{id}")
  public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
    String result = paymentService.paymentCircuitBreaker(id);
    log.info("*****result:" + result);

    return result;
  }
}
