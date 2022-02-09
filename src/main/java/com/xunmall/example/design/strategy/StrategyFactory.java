package com.xunmall.example.design.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2020/12/22 10:59
 */
public class StrategyFactory {

    private Map<String, Strategy> map;

    public StrategyFactory() {

        List<Strategy> strategies = new ArrayList<>();

        strategies.add(new OrdinaryStrategy());
        strategies.add(new SilverStrategy());
        strategies.add(new GoldStrategy());
        strategies.add(new PlatinumStrategy());

        // 看这里 看这里 看这里！
        map = strategies.stream().collect(Collectors.toMap(Strategy::getType, strategy -> strategy));

        /* 等同上面
        map = new HashMap<>();
        for (Strategy strategy : strategies) {
            map.put(strategy.getType(), strategy);
        }*/
    }

    public static class Holder {
        public static StrategyFactory instance = new StrategyFactory();
    }

    public static StrategyFactory getInstance() {
        return Holder.instance;
    }

    public Strategy get(String type) {
        return map.get(type);
    }
}