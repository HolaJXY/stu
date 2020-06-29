package com.king.soft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*********************************************************
 * 文件名称：HiController
 * 系统名称：交易银行系统V1.0
 * 模块名称：com.king.soft
 * 功能说明：HiController
 * 开发人员：jinxy23391
 * 开发时间：2020/1/15 11:50
 * 修改记录：程序版本	修改日期	修改人员	修改单号	修改说明
 *********************************************************/
@RestController
@RefreshScope  // 这个注解声明了刷新配置的范围，如果使用config配置类的话，就声明到配置类上即可
public class HiController {

  @Value("${version}")
  String version;

  //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
  @Autowired
  SchedualServiceHi schedualServiceHi;

  @GetMapping(value = "/hi")
  public String sayHi(@RequestParam String name) {
    return schedualServiceHi.sayHiFromClientOne( name );
  }

  @RequestMapping("/config")
  public String products(@RequestParam String name) {
    return version;
  }
}
