package com.lalala.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName LoadBalancer
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-04 21:34
 * @Version V1.0.0
 */
public interface LoadBalancer {

  ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
