package com.lalala.springcloud.dao;

import com.lalala.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentDao
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-03 13:11
 * @Version V1.0.0
 */
@Mapper
public interface PaymentDao {

  public int create(Payment payment);

  public Payment getPaymentById(@Param("id") Long id);
}
