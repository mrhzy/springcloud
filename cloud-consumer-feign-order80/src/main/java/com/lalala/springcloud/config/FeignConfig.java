package com.lalala.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignConfig
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-05 10:37
 * @Version V1.0.0
 */
@Configuration
public class FeignConfig {

  /**
   * feignClient配置日志级别
   *
   * @return
   */
  @Bean
  public Logger.Level feignLoggerLevel() {
    // 请求和响应的头信息,请求和响应的正文及元数据
    return Logger.Level.FULL;
  }
}
