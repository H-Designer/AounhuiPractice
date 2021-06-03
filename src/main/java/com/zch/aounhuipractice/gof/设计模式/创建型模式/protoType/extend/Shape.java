package com.zch.aounhuipractice.gof.设计模式.创建型模式.protoType.extend;

public interface Shape extends Cloneable{
    Object clone();
    void countArea();
}
