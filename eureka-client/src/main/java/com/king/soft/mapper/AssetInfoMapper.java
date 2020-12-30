package com.king.soft.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.king.soft.entity.AssetInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * 文件描述
 *
 * @ProductName: 现金管理5.0
 * @ProjectName: s-cloud
 * @Package: com.king.soft.mapper
 * @Description: note
 * @Author: jinxy23391
 * @CreateDate: 2020-12-29 15:45
 * @UpdateUser: jinxy23391
 * @UpdateDate: 2020-12-29 15:45
 * @UpdateRemark:
 * @Version: 5.0.0
 * <p>
 * Copyright © 2020 Hundsun Technologies Inc. All Rights Reserved
 **/
@Mapper
public interface AssetInfoMapper extends BaseMapper<AssetInfo> {
}
