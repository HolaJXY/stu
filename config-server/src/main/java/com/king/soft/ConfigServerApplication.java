package com.king.soft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*********************************************************
 * 文件名称：com.king.soft.ConfigServerApplication
 * 系统名称：交易银行系统V1.0
 * 模块名称：PACKAGE_NAME
 * 功能说明：com.king.soft.ConfigServerApplication
 * 开发人员：jinxy23391
 * 开发时间：2020-06-28 14:35
 * 修改记录：程序版本	修改日期	修改人员	修改单号	修改说明
 *********************************************************/
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
@EnableEurekaClient
//SpringBoot在写启动类的时候如果不使用@ComponentScan指明对象扫描范围，默认指扫描当前启动类所在的包里的对象，如果当前启动类没有包，
// 则在启动时会报错：Your ApplicationContext is unlikely to start due to a @ComponentScan of the default package错误。
//因为启动类不能直接放在main/java文件夹下，必须要建一个包把它放进去或者使用@ComponentScan指明要扫描的包。代码示例如下：
public class ConfigServerApplication {
  public static void main(String[] args) {
      SpringApplication.run(ConfigServerApplication.class, args);
  }
}
