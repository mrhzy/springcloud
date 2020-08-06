package com.lalala.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName GateWayConfig
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-06 16:11
 * @Version V1.0.0
 */
@Configuration
public class GateWayConfig {


  @Bean
  public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {

    RouteLocatorBuilder.Builder routes = builder.routes();
    routes.route("path_route_lalala",
        r -> r.path("/guonei")
            .uri("http://news.baidu.com/guonei"))
        .build();

    return routes.build();
  }
}
