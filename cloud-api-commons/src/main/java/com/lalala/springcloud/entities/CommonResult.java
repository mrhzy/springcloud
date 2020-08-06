package com.lalala.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonResult
 * @Description: TODO
 * @Author zhiyou.huang
 * @Date 2020-08-03 13:09
 * @Version V1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

  private Integer code;

  private String message;

  private T data;

  public CommonResult(Integer code, String message) {
    this(code, message, null);
  }
}
