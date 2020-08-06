package com.lalala.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderZkController
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-04 15:14
 * @Version V1.0.0
 */
@RestController
@Slf4j
public class OrderZkController {

  public static final String INVOKE_URL = "http://cloud-provider-payment";
  @Resource
  private RestTemplate restTemplate;

  /**
   * http://localhost/consumer/payment/zk
   *
   * @return
   */
  @GetMapping(value = "/consumer/payment/zk")
  public String paymentInfo() {
    return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
  }
}
