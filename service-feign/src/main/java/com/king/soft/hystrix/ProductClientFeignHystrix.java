package com.king.soft.hystrix;

import com.king.soft.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class ProductClientFeignHystrix implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "请检查服务是否健康";
    }
}
