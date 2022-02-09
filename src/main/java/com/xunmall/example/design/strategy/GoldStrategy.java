package com.xunmall.example.design.strategy;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2020/12/22 10:58
 */
public class GoldStrategy implements Strategy{

    @Override
    public double compute(long money) {
        System.out.println("黄金会员 8折");
        return money * 0.8;
    }

    @Override
    public String getType() {
        return UserType.GOLD_VIP.getCode();
    }
}
