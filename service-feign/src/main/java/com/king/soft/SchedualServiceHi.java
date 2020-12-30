package com.king.soft;

import com.king.soft.hystrix.ProductClientFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*********************************************************
 * 文件名称：SchedualServiceHi
 * 系统名称：交易银行系统V1.0
 * 模块名称：com.king.soft
 * 功能说明：feign接口
 * 开发人员：jinxy23391
 * 开发时间：2020/1/15 11:48
 * 修改记录：程序版本	修改日期	修改人员	修改单号	修改说明
 *********************************************************/
@FeignClient(value = "app-item", fallback = ProductClientFeignHystrix.class)
public interface SchedualServiceHi {

  @RequestMapping(value = "/hi",method = RequestMethod.GET)
  String sayHiFromClientOne(@RequestParam(value = "name") String name);

  @RequestMapping(value = "/getAssetInfo",method = RequestMethod.POST)
  String getAssetInfo(@RequestParam(value = "assetNo") String assetNo);
}
