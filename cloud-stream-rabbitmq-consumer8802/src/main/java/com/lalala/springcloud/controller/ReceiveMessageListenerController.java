package com.lalala.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @ClassName ReceiveMessageListenerController
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-06 23:40
 * @Version V1.0.0
 */
@Component
@EnableBinding(Sink.class)
@Slf4j
public class ReceiveMessageListenerController {

  @Value("${server.port}")
  private String serverPort;

  @StreamListener(Sink.INPUT)
  public void input(Message<String> message) {
    log.info("消费者1号，---> 接受到的消息：{} \t port：{}", message.getPayload(), serverPort);
  }

}
