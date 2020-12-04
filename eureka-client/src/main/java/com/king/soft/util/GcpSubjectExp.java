package com.king.soft.util;

/*********************************************************
 * 文件名称：
 * 系统名称：交易银行系统V1.0
 * 模块名称：com.king.soft.util
 * 功能说明：跨境人民币申报服务
 * 开发人员：jinxy23391
 * 开发时间：2020-08-24 9:41
 * 修改记录：程序版本	修改日期	修改人员	修改单号	修改说明
 *********************************************************/
public class GcpSubjectExp {

  /**
   * 表达式科目代码
   */
  private String gcpSubjectExpCode;

  /**
   * 表达式科目运算符
   */
  private String gcpSubjectExpOperator;

  /**
   * 表达式科目运算比例
   */
  private String gcpSubjectExpPorportion;

  /**
   * 表达式科目运算序号
   */
  private String gcpSubjectExpNum;

  public String getGcpSubjectExpCode() {
    return gcpSubjectExpCode;
  }

  public void setGcpSubjectExpCode(String gcpSubjectExpCode) {
    this.gcpSubjectExpCode = gcpSubjectExpCode;
  }

  public String getGcpSubjectExpNum() {
    return gcpSubjectExpNum;
  }

  public void setGcpSubjectExpNum(String gcpSubjectExpNum) {
    this.gcpSubjectExpNum = gcpSubjectExpNum;
  }

  public String getGcpSubjectExpOperator() {
    return gcpSubjectExpOperator;
  }

  public void setGcpSubjectExpOperator(String gcpSubjectExpOperator) {
    this.gcpSubjectExpOperator = gcpSubjectExpOperator;
  }

  public String getGcpSubjectExpPorportion() {
    return gcpSubjectExpPorportion;
  }

  public void setGcpSubjectExpPorportion(String gcpSubjectExpPorportion) {
    this.gcpSubjectExpPorportion = gcpSubjectExpPorportion;
  }
}
