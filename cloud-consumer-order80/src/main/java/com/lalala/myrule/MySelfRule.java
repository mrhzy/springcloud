package com.lalala.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MySelfRule
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-04 20:41
 * @Version V1.0.0
 */
@Configuration
public class MySelfRule {

  @Bean
  public IRule myRule() {
    // 定义为随机
    return new RandomRule();
  }
}
