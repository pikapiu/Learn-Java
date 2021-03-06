package design.patterns.strategy.impl;

import design.patterns.strategy.StrategyInterface;

/**
 * @Author: zs
 * @Date: 2019/7/11 10:02
 */
public class StrategyTest {

    private final StrategyInterface strategyInterface;

    public StrategyTest(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }

    public String say(){
        return strategyInterface.say();
    }

    public static void main(String[] args) {

        StrategyTest testHello = new StrategyTest(new SayHello());
        StrategyTest testWorld = new StrategyTest(new SayWorld());
        StrategyTest hello = new StrategyTest(testHello::say);

        System.out.println(hello.say());
        System.out.println(testHello.say());
        System.out.println("===");
        System.out.println(testWorld.say());

        System.out.println("instead of");



        StrategyTest lambda = new StrategyTest(() -> "hello lambda");

        System.out.println(lambda.say());
    }
}
