package com.lalala.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Payment
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-03 13:06
 * @Version V1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

  private Long id;

  private String serial;
}
