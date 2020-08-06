package com.lalala.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ConfigClientMain3355
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-06 19:53
 * @Version V1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
  public static void main(String[] args) {
    SpringApplication.run(ConfigClientMain3355.class, args);
  }
}
