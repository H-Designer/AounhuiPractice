package com.zch.aounhuipractice.gof.设计模式.创建型模式.simpleFactory;

public class SimpleFactory {
     public Pizza createPizza(String orderType){
         Pizza pizza = null;
         if (orderType.equals("cheese")){
             pizza = new CheesePizza();
         }else if (orderType.equals("greek")){
             pizza = new GreekPizza();
         }
         return pizza;

     }
}
