package com.zch.aounhuipractice.gof.设计模式.创建型模式.simpleFactory;

public class PizzaStore {

    public static void main(String args[]){
         OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
    }
}
