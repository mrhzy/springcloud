package com.lalala.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallbackService
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-06 10:26
 * @Version V1.0.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

  @Override
  public String paymentInfoOK(Integer id) {
    return "---------PaymentFallbackService --> fall back paymentInfoOK (┬＿┬)...";
  }

  @Override
  public String paymentInfoTimeOut(Integer id) {
    return "---------PaymentFallbackService --> fall back paymentInfoTimeOut (┬＿┬)...";
  }
}
