package com.xunmall.example.design.proxy;

/**
 *
 * @author Gimgoog
 * @date 2018/2/23
 */
public class MethodPerformance {

    private Long startTime;
    private Long endTime;
    private String methodName;

    public MethodPerformance(String methodName) {
        startTime = System.currentTimeMillis();
        this.methodName = methodName;
    }

    public void printlnMethodInfo() {
        endTime = System.currentTimeMillis();
        Long executeTime = endTime - startTime;
        System.out.println("当前方法：" + methodName + "执行，耗时：" + executeTime + "毫秒");
    }
}
