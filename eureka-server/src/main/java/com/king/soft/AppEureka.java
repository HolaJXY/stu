package com.king.soft;

/*********************************************************
 * 文件名称：AppEureka
 * 系统名称：交易银行系统V1.0
 * 模块名称：com.king.soft
 * 功能说明：服务启动类
 * 开发人员：jinxy23391
 * 开发时间：2020/1/7 10:01
 * 修改记录：程序版本	修改日期	修改人员	修改单号	修改说明
 *********************************************************/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka注册中心
 */
@SpringBootApplication
@EnableEurekaServer //申明这是一个Eureka注册中心
public class AppEureka {

    public static void main(String[] args) {
        SpringApplication.run(AppEureka.class, args);
    }
}
