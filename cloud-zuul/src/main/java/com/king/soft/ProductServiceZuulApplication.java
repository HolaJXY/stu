package com.king.soft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/*********************************************************
 * 文件名称：
 * 系统名称：交易银行系统V1.0
 * 模块名称：com.king.soft
 * 功能说明：跨境人民币申报服务
 * 开发人员：jinxy23391
 * 开发时间：2020-07-03 14:02
 * 修改记录：程序版本	修改日期	修改人员	修改单号	修改说明
 *********************************************************/
@SpringBootApplication
//启动类，主要是 @EnableZuulProxy
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ProductServiceZuulApplication {

    public static void main(String[] args) {
    SpringApplication.run(ProductServiceZuulApplication.class, args);
  }
}
