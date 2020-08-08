package com.lalala.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PaymentController
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-07 10:53
 * @Version V1.0.0
 */
@RestController
@Slf4j
public class PaymentController {

  @Value("${server.port}")
  private String serverPort;

  @GetMapping(value = "/payment/nacos/{id}")
  public String getPayment(@PathVariable("id") Integer id) {
    return "nacos registry,serverPort：" + serverPort + "\t id:" + id;
  }
}
