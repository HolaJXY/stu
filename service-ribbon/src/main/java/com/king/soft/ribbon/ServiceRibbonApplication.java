package com.king.soft.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*********************************************************
 * 文件名称：ServiceRibbonApplication
 * 系统名称：交易银行系统V1.0
 * 模块名称：com.king.soft.ribbon
 * 功能说明：服务消费者
 * 开发人员：jinxy23391
 * 开发时间：2020/1/12 16:33
 * 修改记录：程序版本	修改日期	修改人员	修改单号	修改说明
 *********************************************************/
@SpringBootApplication
@EnableEurekaClient
//启动类， 注解多了个 @EnableDiscoveryClient， 表示用于发现eureka 注册中心的微服务。
@EnableDiscoveryClient
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run( ServiceRibbonApplication.class, args );
    }

    /**
     * 在工程的启动类中,通过@EnableDiscoveryClient向服务中心注册；并且向程序的ioc注入一个bean: restTemplate;并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
     * 还多了个 RestTemplate，就表示用 restTemplate 这个工具来做负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
