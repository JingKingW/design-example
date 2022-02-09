package com.xunmall.example.design.strategy;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2020/12/22 10:58
 */
public class PlatinumStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("白金会员 优惠50元，再打7折");
        return (money - 50) * 0.7;
    }

    @Override
    public String getType() {
        return UserType.PLATINUM_VIP.getCode();
    }
}
