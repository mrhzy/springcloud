package com.lalala.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMain8006
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-04 17:17
 * @Version V1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {
  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8006 .class, args);
  }
}
