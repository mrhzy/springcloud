package com.lalala.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName PaymentController
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-04 14:50
 * @Version V1.0.0
 */
@RestController
@Slf4j
public class PaymentController {

  @Value("${server.port}")
  private String serverPort;

  @GetMapping(value = "/payment/zk")
  public String paymentZK() {

    return "springcloud with zookeeper：" + serverPort + "\t" + UUID.randomUUID().toString();
  }
}
