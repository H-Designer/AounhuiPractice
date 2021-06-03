package com.zch.aounhuipractice.gof.设计原则.LKP;

public class Agentmain {
    public static void main(String args[]){
        Agent agent = new Agent();
        agent.setStar(new Star("林心如"));
        agent.setCompany(new Company("央视"));

        agent.setFans(new Fans("赵贤"));
        agent.meeting();
        agent.business();
    }
}
