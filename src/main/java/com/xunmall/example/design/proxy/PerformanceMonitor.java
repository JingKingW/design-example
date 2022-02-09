package com.xunmall.example.design.proxy;

/**
 *
 * @author Gimgoog
 * @date 2018/2/23
 */
public class PerformanceMonitor {

    private static final ThreadLocal<MethodPerformance> threadLocal = new ThreadLocal<>();

    public static void beginMonitor(String methodName){
        System.out.println("begin monitor!");
        MethodPerformance methodPerformance = new MethodPerformance(methodName);
        threadLocal.set(methodPerformance);
    }

    public static void endMonitor(){
        System.out.println("end monitor!");
        MethodPerformance methodPerformance = threadLocal.get();
        methodPerformance.printlnMethodInfo();
    }

}
