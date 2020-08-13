package com.lalala.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName ConfigCenterMain3344
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-06 18:35
 * @Version V1.0.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
  public static void main(String[] args) {
    SpringApplication.run(ConfigCenterMain3344.class, args);
  }
}
