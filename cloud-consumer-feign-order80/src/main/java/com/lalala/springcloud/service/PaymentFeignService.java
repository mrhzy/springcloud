package com.lalala.springcloud.service;

import com.lalala.springcloud.entities.CommonResult;
import com.lalala.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName PaymentFeignService
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-04 22:41
 * @Version V1.0.0
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

  @GetMapping(value = "/payment/get/{id}")
  public CommonResult<Payment> get(@PathVariable("id") Long id);


  @GetMapping(value = "/payment/feign/timeout")
  public String feignTimeout();
}
