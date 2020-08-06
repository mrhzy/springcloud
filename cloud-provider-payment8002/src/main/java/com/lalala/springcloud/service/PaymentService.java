package com.lalala.springcloud.service;

import com.lalala.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentService
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-03 13:18
 * @Version V1.0.0
 */
public interface PaymentService {
  public int create(Payment payment);

  public Payment getPaymentById(@Param("id") Long id);
}
