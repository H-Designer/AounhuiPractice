package com.zch.aounhuipractice.gof.设计模式.结构型模式.bridge;

public class  main {
    public static void main(String args[]){
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstarction(implementor);
        abstraction.Operation();
    }
}
