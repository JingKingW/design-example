package com.xunmall.example.design.strategy;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2020/12/22 11:00
 */
public class Main {

    private static double getResult(long money, String type) {
        if (money < 1000) {
            return money;
        }
        Strategy strategy = StrategyFactory.getInstance().get(type);
        if (strategy == null){
            throw new IllegalArgumentException("please input right type");
        }
        return strategy.compute(money);
    }

    public static void main(String[] args) {
        System.out.println(getResult(2300,UserType.GOLD_VIP.getCode()));
    }
}
