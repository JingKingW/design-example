package com.xunmall.example.design.proxy.jdk;

import com.xunmall.example.design.proxy.PerformanceMonitor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Eugene
 * @date 2017/1/9
 */
public class ProxyDbQuest implements InvocationHandler {

    private Object target;

    public ProxyDbQuest(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.beginMonitor(method.getName());
        Object object = method.invoke(target, args);
        PerformanceMonitor.endMonitor();
        return object;
    }
}
