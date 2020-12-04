package com.king.soft.util;

/**
 * 文件描述
 *
 * @ProductName: 现金管理5.0
 * @ProjectName: s-cloud
 * @Package: com.king.soft.util
 * @Description: note
 * @Author: jinxy23391
 * @CreateDate: 2020-12-03 15:20
 * @UpdateUser: jinxy23391
 * @UpdateDate: 2020-12-03 15:20
 * @UpdateRemark:
 * @Version: 5.0.0
 * <p>
 * Copyright © 2020 Hundsun Technologies Inc. All Rights Reserved
 **/
@FunctionalInterface
public interface CompleteServiceCallback<K, V> {
    V work (K var);
}
