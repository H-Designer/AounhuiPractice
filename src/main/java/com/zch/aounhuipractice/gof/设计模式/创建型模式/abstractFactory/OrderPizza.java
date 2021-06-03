package com.zch.aounhuipractice.gof.设计模式.创建型模式.abstractFactory;

import java.util.Scanner;

public class OrderPizza {
   AbsFactory absFactory ;

   public OrderPizza(AbsFactory absFactory){
       setAbsFactory(absFactory);
   }
   private void setAbsFactory(AbsFactory absFactory){
       Pizza pizza = null;
       String orderType = "";
       this.absFactory = absFactory;
       do {
           orderType = getType();
           //absFactory是setAbsFactory传入的类型，可能是beijign也可能是伦敦，然后调用对应的实现类。
           pizza = absFactory.createPizza(orderType);
           if (pizza  != null){
               pizza.prepare();
               pizza.bake();
               pizza.cat();
               pizza.box();
           }else {
               break;
           }
       }while (true);
   }
   public String getType(){
       Scanner scanner = new Scanner(System.in);
       return scanner.next();

   }
}
