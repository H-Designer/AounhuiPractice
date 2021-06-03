package com.zch.aounhuipractice.gof.设计原则.LSP;


public class Animal {

    public double runSpeed;

    public double getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(double runSpeed) {
        this.runSpeed = runSpeed;
    }
    public double getRunTime(double distance){
        return distance/runSpeed;
    }
}
