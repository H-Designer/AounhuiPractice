package com.zch.aounhuipractice.gof.设计模式.创建型模式.protoType.extend;

public class main {
    public static void main(String args[]){
        PrototypeManager prototypeManager = new PrototypeManager();
        Shape shape1 = prototypeManager.getShape("Circle");
        shape1.countArea();
        Shape shape2 = prototypeManager.getShape("Square");
        shape2.countArea();
    }
}
