package com.lalala.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName OrderNacosMain83
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-07 12:07
 * @Version V1.0.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain83 {

  public static void main(String[] args) {
    SpringApplication.run(OrderNacosMain83.class, args);
  }
}
