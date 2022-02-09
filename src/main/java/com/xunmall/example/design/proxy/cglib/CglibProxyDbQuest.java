package com.xunmall.example.design.proxy.cglib;

import com.xunmall.example.design.proxy.PerformanceMonitor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *
 * @author Eugene
 * @date 2017/2/14
 */
public class CglibProxyDbQuest implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return  enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] arg, MethodProxy methodProxy) throws Throwable {
        PerformanceMonitor.beginMonitor(method.getName());
        Object object = methodProxy.invokeSuper(obj, arg);
        PerformanceMonitor.endMonitor();
        return object;
    }
}
