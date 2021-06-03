package com.zch.aounhuipractice.gof.设计模式.结构型模式.bridge;

public class ConcreteImplementorA implements Implementor {
    public void OperationImpl(){
        System.out.println("具体实例化被访问");
    }
}
