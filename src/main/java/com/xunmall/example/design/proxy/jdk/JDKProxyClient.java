package com.xunmall.example.design.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 *
 * @author Eugene
 * @date 2017/1/9
 */
public class JDKProxyClient {

    public static void main(String[] args) {
        //jdk实现动态代理方法
        IDBQuery idbQuery = (IDBQuery) Proxy.newProxyInstance(IDBQuery.class.getClassLoader(),
                new Class[]{IDBQuery.class},
                new ProxyDbQuest(new DbQuery()));
        idbQuery.requestMq("tom");
    }
}
