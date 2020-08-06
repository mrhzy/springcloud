package com.lalala.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ConfigClientMain3366
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-06 21:13
 * @Version V1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {
  public static void main(String[] args) {
    SpringApplication.run(ConfigClientMain3366.class, args);
  }
}
