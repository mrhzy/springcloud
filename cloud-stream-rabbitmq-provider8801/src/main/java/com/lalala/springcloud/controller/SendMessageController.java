package com.lalala.springcloud.controller;

import com.lalala.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName SendMessageController
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-06 23:12
 * @Version V1.0.0
 */
@RestController
@Slf4j
public class SendMessageController {

  @Resource
  private IMessageProvider messageProvider;

  @GetMapping("/sendMessage")
  public String sendMessage(){

    return messageProvider.send();
  }
}
