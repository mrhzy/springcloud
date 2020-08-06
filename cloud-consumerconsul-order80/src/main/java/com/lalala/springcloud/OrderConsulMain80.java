package com.lalala.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName OrderConsulMain80
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-04 17:56
 * @Version V1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {

  public static void main(String[] args) {
    SpringApplication.run(OrderConsulMain80.class, args);
  }
}
