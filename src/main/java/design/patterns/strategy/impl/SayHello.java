package design.patterns.strategy.impl;

import design.patterns.strategy.StrategyInterface;

/**
 * @Author: zs
 * @Date: 2019/7/11 10:01
 */
public class SayHello implements StrategyInterface {
    @Override
    public String say() {
        return "hello";
    }
}
