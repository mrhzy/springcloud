package com.lalala.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderConsulController
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-04 17:56
 * @Version V1.0.0
 */
@RestController
@Slf4j
public class OrderConsulController {

  public static final String invoke_url = "http://consul-provider-payment";

  @Resource
  private RestTemplate restTemplate;

  @GetMapping(value = "/consumer/payment/consul")
  public String paymentInfo() {

    return restTemplate.getForObject(invoke_url + "/payment/consul", String.class);
  }
}
