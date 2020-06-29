package com.king.soft.ribbon.controller;

import com.king.soft.ribbon.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*********************************************************
 * 文件名称：HelloControler
 * 系统名称：交易银行系统V1.0
 * 模块名称：com.king.soft.ribbon.controller
 * 功能说明：服务消费控制层
 * 开发人员：jinxy23391
 * 开发时间：2020/1/12 16:42
 * 修改记录：程序版本	修改日期	修改人员	修改单号	修改说明
 *********************************************************/
@RestController
public class HelloControler {

  @Autowired
  HelloService helloService;

  @GetMapping(value = "/hi")
  public String hi(@RequestParam String name) {
    return helloService.hiService( name );
  }

}
