package com.zch.aounhuipractice.gof.设计模式.创建型模式.simpleFactory;

import java.util.Scanner;

public class OrderPizza {
    SimpleFactory simpleFactory ;
    Pizza pizza;
    public OrderPizza(SimpleFactory simpleFactory){
       setType(simpleFactory);
    }
    public String setType(SimpleFactory simpleFactory){
        String orderType ="";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cat();
                pizza.box();
            }
        }while (true);
    }
    public String getType(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
