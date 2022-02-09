package com.xunmall.example.design.strategy;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2020/12/22 10:57
 */
public class SilverStrategy implements Strategy {

    @Override
    public double compute(long money) {

        System.out.println("白银会员 优惠50元");
        return money - 50;
    }

    @Override
    public String getType() {
        return UserType.SILVER_VIP.getCode();
    }
}
