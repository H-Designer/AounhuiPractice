package com.zch.aounhuipractice.gof.设计模式.创建型模式.abstractFactory;

public class BeijingFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("北京pizza");
        if (orderType.equals("cheese")){
            pizza = new CheesePizza();
        }else if (orderType.equals("greek")){
            pizza = new GreekPizza();
        }else {

        }
        return pizza;
    }
}
