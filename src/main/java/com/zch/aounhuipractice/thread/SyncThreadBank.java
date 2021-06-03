package com.zch.aounhuipractice.thread;

//不安全取钱
public class SyncThreadBank {
    public static void main(String[] args) {
        Account account = new Account(1000,"结婚基金");
        Drawing you = new Drawing(account, 50,"你");
        Drawing girlFriend = new Drawing(account, 100,"girlFriend");
        you.start();
        girlFriend.start();
    }
}
//账号
class Account {
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

//银行：模拟取款
class Drawing extends Thread{
    Account account;
    int drawingMoney;
    int nowMoney;
    public Drawing(Account account, int drawingMoney, String name){
        this.account = account;
        this.drawingMoney = drawingMoney;
        super.setName(name);
    }

    @Override
    public void run() {
        synchronized (account){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (account.money - drawingMoney < 0){
                System.out.println(Thread.currentThread().getName()+"钱不够，取不了");
                return;
            }
            System.out.println(Thread.currentThread().getName()+"现在取钱="+drawingMoney);
            account.money = account.money - drawingMoney;
            System.out.println("账户余额变成"+account.money);
            nowMoney = nowMoney + drawingMoney;
            System.out.println(this.getName()+"手里钱变成"+nowMoney);
        }

    }
}