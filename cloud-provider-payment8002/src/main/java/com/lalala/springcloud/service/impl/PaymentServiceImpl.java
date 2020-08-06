package com.lalala.springcloud.service.impl;

import com.lalala.springcloud.dao.PaymentDao;
import com.lalala.springcloud.entities.Payment;
import com.lalala.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-03 13:18
 * @Version V1.0.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

  @Resource
  private PaymentDao paymentDao;

  @Override
  public int create(Payment payment) {
    return paymentDao.create(payment);
  }

  @Override
  public Payment getPaymentById(Long id) {
    return paymentDao.getPaymentById(id);
  }
}
