package com.zch.aounhuipractice.gof.设计模式.创建型模式.abstractFactory;

public class PizzaStore {
    public static void main(String args[]){
        new OrderPizza(new BeijingFactory());
    }
}
