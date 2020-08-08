package com.lalala.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMain9002
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-07 11:56
 * @Version V1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {

  public static void main(String[] args) {
    SpringApplication.run(PaymentMain9002.class, args);
  }
}
