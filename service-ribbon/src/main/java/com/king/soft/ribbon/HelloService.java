package com.king.soft.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/*********************************************************
 * 文件名称：
 * 系统名称：交易银行系统V1.0
 * 模块名称：com.king.soft.ribbon
 * 功能说明：跨境人民币申报服务
 * 开发人员：jinxy23391
 * 开发时间：2020/1/12 16:35
 * 修改记录：程序版本	修改日期	修改人员	修改单号	修改说明
 *********************************************************/
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * 写一个测试类HelloService，通过之前注入ioc容器的restTemplate来消费client中的服务的“/hi”接口，在这里我们直接用的程序名替代了具体的url地址，
     * 在ribbon中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名
     * @param name
     * @return
     */
    //@HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://app-item/hi?name="+name,String.class);
    }

}
