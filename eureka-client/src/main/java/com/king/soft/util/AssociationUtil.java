package com.king.soft.util;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/*********************************************************
 * 文件名称：AssociationUtil.java
 * 系统名称：交易银行系统V1.0
 * 模块名称：com.king.soft.util
 * 功能说明：java实现组合的工具类
 * 开发人员：jinxy23391
 * 开发时间：2020-08-22 15:39
 * 修改记录：程序版本	修改日期	修改人员	修改单号	修改说明
 *********************************************************/
public class AssociationUtil {
    public static Stack<String> stack = new Stack<String>();
    private static List<String> lists = new ArrayList<>();
    public static void main(String[] args) {

      List<String> gcpSubjectExpCodes = new ArrayList<>();
      gcpSubjectExpCodes.add("1000001");
      gcpSubjectExpCodes.add("1000002");
        gcpSubjectExpCodes.add("1000003");
        gcpSubjectExpCodes.add("1000004");
        gcpSubjectExpCodes.add("1000005");
      System.out.println(getAssaction(gcpSubjectExpCodes, 2));
    }

  /**
   * 获取科目表达式组合
   * @param exps 元素
   * @param tag 要选多少个元素
   */
    public static List<String> getAssaction(List<String> exps, int tag){
        association(exps,2,0,0); // 从这个数组4个数中选择二个
        return lists;
    }

    /**
     *数组
     * @param shu  元素
     * @param targ  要选多少个元素
     * @param has   当前有多少个元素
     * @param cur   当前选到的下标
     *
     * 1    2   3     //开始下标到2
     * 1    2   4     //然后从3开始
     */
    private static void association(String[] shu, int targ, int has, int cur) {
        //组合数达到指定位数则输出并退出
        if(has == targ) {
            System.out.println(stack);
            stack.forEach(item -> {

            });
            return;
        }

        for(int i=cur;i<shu.length;i++) {
            if(!stack.contains(shu[i])) {
                stack.add(shu[i]);
                association(shu, targ, has+1, i);
                stack.pop();
            }
        }
    }

    /**
     *集合
     * @param shu  元素
     * @param targ  要选多少个元素
     * @param has   当前有多少个元素
     * @param cur   当前选到的下标
     *
     * 1    2   3     //开始下标到2
     * 1    2   4     //然后从3开始
     */
    private static void association(List<String> shu, int targ, int has, int cur) {
        //组合数达到指定位数则输出并退出
        if(has == targ) {
            AtomicReference<String> index = new AtomicReference<String>("");
            for (String item : stack) {
                if (!index.compareAndSet("", item + "-")) {
                    index.set(index.get() + item);
                }
            }
            lists.add(String.valueOf(index));
            return;
        }

        for(int i=cur;i<shu.size();i++) {
            if(!stack.contains(shu.get(i))) {
                stack.add(shu.get(i));
                association(shu, targ, has+1, i);
                stack.pop();
            }
        }
    }
}
