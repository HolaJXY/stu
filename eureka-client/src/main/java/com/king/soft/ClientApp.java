package com.king.soft;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.king.soft.entity.AssetInfo;
import com.king.soft.mapper.AssetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*********************************************************
 * 文件名称：ItemApp
 * 系统名称：交易银行系统V1.0
 * 模块名称：com.king.soft
 * 功能说明：eureka客户端启动类
 * 开发人员：jinxy23391
 * 开发时间：2020/1/7 10:20
 * 修改记录：程序版本	修改日期	修改人员	修改单号	修改说明
 *********************************************************/
//申明这是一个Spring Boot项目
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApp {

  public static void main(String[] args) {
      SpringApplication.run(ClientApp.class, args);
  }

  @Autowired
  private AssetInfoService assetInfoService;

  @Value("${server.port}")
  String port;

  @RequestMapping("/hi")
  public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
    return "hi " + name + " ,i am from port:" + port;
  }

  @RequestMapping("/getAssetInfo")
  public AssetInfo getAssetInfo(@RequestParam(value = "assetNo", defaultValue = "forezp") String assetNo) {
    QueryWrapper<AssetInfo> queryWrapper = new QueryWrapper<>();
    if(!StringUtils.isEmpty(assetNo)) {
        queryWrapper = queryWrapper.eq("asset_no", assetNo);
    }
    return assetInfoService.getOne(queryWrapper);
  }

}
