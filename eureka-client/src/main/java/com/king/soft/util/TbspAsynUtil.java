package com.king.soft.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 文件描述
 *
 * @ProductName: 现金管理5.0
 * @ProjectName: s-cloud
 * @Package: com.king.soft.util
 * @Description: note
 * @Author: jinxy23391
 * @CreateDate: 2020-12-03 15:17
 * @UpdateUser: jinxy23391
 * @UpdateDate: 2020-12-03 15:17
 * @UpdateRemark:
 * @Version: 5.0.0
 * <p>
 * Copyright © 2020 Hundsun Technologies Inc. All Rights Reserved
 **/
public class TbspAsynUtil {
    public static <K, V> List<V> done (List<K> reqList, CompleteServiceCallback<K, V> callback) {

        long startTime = System.currentTimeMillis();
        List<V> respList = new ArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        callback.work(reqList.get(0));
        return respList;
    }
}
