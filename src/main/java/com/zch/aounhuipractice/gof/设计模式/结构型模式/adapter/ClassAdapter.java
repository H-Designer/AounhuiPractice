package com.zch.aounhuipractice.gof.设计模式.结构型模式.adapter;

public class  ClassAdapter extends Adapter implements Target {
    public void request(){
        specificRequest();
    }
}
