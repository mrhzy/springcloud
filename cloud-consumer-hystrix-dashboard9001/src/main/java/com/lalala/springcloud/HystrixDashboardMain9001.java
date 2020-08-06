package com.lalala.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName HystrixDashboardMain9001
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-06 11:56
 * @Version V1.0.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
  public static void main(String[] args) {
    SpringApplication.run(HystrixDashboardMain9001.class);
  }
}
