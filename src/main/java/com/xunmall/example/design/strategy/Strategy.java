package com.xunmall.example.design.strategy;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2020/12/22 10:44
 */
public interface Strategy {

    double compute(long money);

    String getType();
}
