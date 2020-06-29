package com.king.soft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*********************************************************
 * 文件名称：ServiceFeignApplication
 * 系统名称：交易银行系统V1.0
 * 模块名称：com.king.soft
 * 功能说明：Feignx消费者启动类
 * 开发人员：jinxy23391
 * 开发时间：2020/1/14 20:48
 * 修改记录：程序版本	修改日期	修改人员	修改单号	修改说明
 *********************************************************/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeignApplication {

  public static void main(String[] args) {
      SpringApplication.run( ServiceFeignApplication.class, args );
  }
}
