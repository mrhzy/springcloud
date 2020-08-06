package com.lalala.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName PaymentController
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-04 17:18
 * @Version V1.0.0
 */
@RestController
@Slf4j
public class PaymentController {

  @Value("${server.port}")
  private String serverPort;

  @GetMapping(value = "/payment/consul")
  public String paymentConsul() {

    return "springcloud with consul：" + serverPort + "\t" + UUID.randomUUID().toString();
  }
}


