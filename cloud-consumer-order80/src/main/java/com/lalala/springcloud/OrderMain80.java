package com.lalala.springcloud;

import com.lalala.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName OrderMain80
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-03 21:04
 * @Version V1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderMain80 {

  public static void main(String[] args) {
    SpringApplication.run(OrderMain80.class, args);
  }
}
