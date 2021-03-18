package com.design.pattern.creational.strategy;

public class Main {
    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext(new Onfoot());
        strategyContext.contextInterface();

    }
}

