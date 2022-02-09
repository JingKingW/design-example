package com.xunmall.example.design.strategy;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2020/12/22 10:44
 */
public class OrdinaryStrategy implements Strategy {

    @Override
    public double compute(long money) {
        System.out.println("普通会员 不打折");
        return money;
    }

    @Override
    public String getType() {
        return UserType.COMMON_VIP.getCode();
    }
}

