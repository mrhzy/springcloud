package com.lalala.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentMain8001
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-03 10:18
 * @Version V1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {

  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8001.class, args);
  }
}
