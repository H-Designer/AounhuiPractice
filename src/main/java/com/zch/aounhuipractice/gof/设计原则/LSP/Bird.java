package com.zch.aounhuipractice.gof.设计原则.LSP;

public class Bird extends Animal {

    public double flySpeed;

    public double getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public double getFlyTime(double distance){
        return distance/flySpeed;
    }
}
