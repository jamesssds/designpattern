package com.design.pattern.creational.strategy;

public class StrategyContext{
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.toWorkWay();
    }
}
