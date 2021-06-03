package com.zch.aounhuipractice.gof.设计模式.创建型模式.protoType.extend;

import java.util.HashMap;

public class PrototypeManager {
    private HashMap<String,Shape> hashMap = new HashMap<String,Shape>();
    public PrototypeManager(){
        hashMap.put("Circle",new Circle());
        hashMap.put("Square",new Square());
    }
    public void addShape(String key,Shape shape){
        hashMap.put(key,shape);
    }
    public Shape getShape(String key){
        return hashMap.get(key);
    }
}
