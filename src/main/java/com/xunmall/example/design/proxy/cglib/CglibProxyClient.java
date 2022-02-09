package com.xunmall.example.design.proxy.cglib;

/**
 *
 * @author Eugene
 * @date 2018/2/23
 */
public class CglibProxyClient {

    public static void main(String[] agrs){
        CglibProxyDbQuest cglibProxyDbQuest = new CglibProxyDbQuest();
        LocalQuest localQuest = (LocalQuest) cglibProxyDbQuest.getProxy(LocalQuest.class);
        localQuest.requestMq("gimgoog");
    }
}
