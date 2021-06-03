package com.zch.aounhuipractice.gof.设计模式.创建型模式.abstractFactory;

public abstract class Pizza {

    protected String name;
    public abstract void prepare();

    public void bake(){
        System.out.println(name + "baking");
    }
    public void cat(){
        System.out.println(name + "catting");
    }
    public void box(){
        System.out.println(name + "boxing");
    }
    public void setName(String name){
        this.name = name;
    }
}
