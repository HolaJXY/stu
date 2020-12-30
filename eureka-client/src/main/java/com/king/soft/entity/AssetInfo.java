package com.king.soft.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 文件描述
 *
 * @ProductName: 现金管理5.0
 * @ProjectName: s-cloud
 * @Package: com.king.soft.entity
 * @Description: note
 * @Author: jinxy23391
 * @CreateDate: 2020-12-29 15:39
 * @UpdateUser: jinxy23391
 * @UpdateDate: 2020-12-29 15:39
 * @UpdateRemark:
 * @Version: 5.0.0
 * <p>
 * Copyright © 2020 Hundsun Technologies Inc. All Rights Reserved
 **/
@Data
@TableName("asset_info")
public class AssetInfo implements Serializable {
    private static final long serialVersionUID = -1182493724575075091L;

    private String assetNo;
    private BigDecimal balance;
}
