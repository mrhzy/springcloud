package com.lalala.springcloud.controller;

import com.lalala.springcloud.entities.CommonResult;
import com.lalala.springcloud.entities.Payment;
import com.lalala.springcloud.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @ClassName OrderController
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-03 21:06
 * @Version V1.0.0
 */
@RestController
@Slf4j
public class OrderController {

  //public static final String PAYMENT_URL = "http://localhost:8001";
  public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

  @Resource
  private RestTemplate restTemplate;

  @Resource
  private LoadBalancer loadBalancer;

  @Resource
  private DiscoveryClient discoveryClient;

  @GetMapping("/consumer/payment/create")
  public CommonResult<Payment> create(Payment payment) {

    return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);

  }

  @GetMapping("/consumer/payment/get/{id}")
  public CommonResult<Payment> getPayment(@PathVariable Long id) {

    return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
  }


  @GetMapping("/consumer/payment/getForEntity/{id}")
  public CommonResult<Payment> getPayment2(@PathVariable Long id) {

    ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);

    if (entity.getStatusCode().is2xxSuccessful()) {

      //log.info(entity.getStatusCode());
      return entity.getBody();
    } else {

      return new CommonResult<>(444, "操作失败！");
    }
  }

  @GetMapping(value = "/consumer/payment/lb")
  public String getPaymentLB() {

    List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");

    if (CollectionUtils.isEmpty(instances)) {

      return null;
    }

    ServiceInstance serviceInstance = loadBalancer.instances(instances);

    URI uri = serviceInstance.getUri();

    return restTemplate.getForObject(uri + "/payment/lb", String.class);
  }
}
