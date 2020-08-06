package com.lalala.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigClientController
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-06 19:54
 * @Version V1.0.0
 */
@RestController
@RefreshScope
@Slf4j
public class ConfigClientController {

  @Value("${config.info}")
  private String configInfo;

  @GetMapping("/configInfo")
  public String getConfigInfo() {

    return configInfo;
  }
}
