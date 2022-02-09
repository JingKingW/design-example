package com.xunmall.example.design.flyweight;

/**
 * @Author: WangYanjing
 * @Date: ${Date} ${Time}
 * @Description: 享元模式
 */
public interface IReportManager {
    String createReport();

    void operation(String name);

    String getType();
}
