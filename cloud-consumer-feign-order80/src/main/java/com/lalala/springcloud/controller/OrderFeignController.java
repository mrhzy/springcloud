package com.lalala.springcloud.controller;

import com.lalala.springcloud.entities.CommonResult;
import com.lalala.springcloud.entities.Payment;
import com.lalala.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderFeignController
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-04 22:40
 * @Version V1.0.0
 */
@RestController
@Slf4j
public class OrderFeignController {

  @Resource
  private PaymentFeignService paymentFeignService;

  @GetMapping("/consumer/payment/get/{id}")
  public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {

    return paymentFeignService.get(id);
  }

  @GetMapping(value = "/consumer/payment/feign/timeout")
  public String feignTimeout() {
    return paymentFeignService.feignTimeout();
  }

}
