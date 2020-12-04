package com.king.soft.service.adapter.对象适配器模式;

/*********************************************************
 * 文件名称：
 * 系统名称：交易银行系统V1.0
 * 模块名称：com.king.soft.service.adapter.对象适配器模式
 * 功能说明：跨境人民币申报服务
 * 开发人员：jinxy23391
 * 开发时间：2020-08-18 16:43
 * 修改记录：程序版本	修改日期	修改人员	修改单号	修改说明
 *********************************************************/
public class Adpater extends Usber implements Ps2 {
    @Override
    public void isPs2() {
        isUsb();
    }
}
