package com.lalala.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName OrderZkMain80
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-04 15:12
 * @Version V1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain80 {
  public static void main(String[] args) {
    SpringApplication.run(OrderZkMain80.class, args);
  }
}
