package com.zch.aounhuipractice.gof.设计模式.创建型模式.abstractFactory;

public class LundunFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("伦敦pizza");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new CheesePizza();
        }else if (orderType.equals("greek")){
            pizza = new GreekPizza();
        }else {

        }
        return pizza;
    }
}
