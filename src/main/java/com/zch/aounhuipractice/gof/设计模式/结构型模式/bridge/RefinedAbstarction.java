package com.zch.aounhuipractice.gof.设计模式.结构型模式.bridge;

public class RefinedAbstarction extends Abstraction {
    protected RefinedAbstarction(Implementor implementor){
        super(implementor);
    }
    public void Operation(){
        System.out.println("抽象化被访问");
        implementor.OperationImpl();
    }
}
