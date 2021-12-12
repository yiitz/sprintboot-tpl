package com.yiitz.webtpl.controller;

import org.springframework.web.bind.annotation.RestController;

import com.yiitz.webtpl.protocol.Result;
import com.yiitz.webtpl.vo.RespSystemInfoVO;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class IndexController {

  @GetMapping(value = "/")
  public Result index() {
    RespSystemInfoVO systemInfoVO = new RespSystemInfoVO();
    systemInfoVO.setVersion("1.0.0");
    return Result.ok(systemInfoVO);
  }
}
