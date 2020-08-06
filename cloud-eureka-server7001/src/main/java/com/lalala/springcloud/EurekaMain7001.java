package com.lalala.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaMain7001
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-03 21:50
 * @Version V1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {

  public static void main(String[] args) {
    SpringApplication.run(EurekaMain7001.class, args);
  }
}
