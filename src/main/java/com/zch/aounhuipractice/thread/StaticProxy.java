package com.zch.aounhuipractice.thread;

/**
 * 人间四大喜事：
 *  久旱逢甘露、他乡遇故知、洞房花烛夜、金榜题名时
 */

/**
 * 静态代理总结：
 *  真实的对象和代理对象要实现同一个接口
 *  代理对象要代理真实的对象。
 * */

/**
 * 好处：代理对象可以做很多真实对象做不了的事情，真实的对象只用做自己的事情就可以。
 * */
public class StaticProxy {
    public static void main(String[] args) {
        WeddingCompany weddingCompany = new WeddingCompany(new You());
        weddingCompany.happyMarry();
    }
}

interface Marry{
    void happyMarry();
}

class You implements Marry{

    @Override
    public void happyMarry() {
        System.out.println("我要结婚了，好开心");
    }
}

//代理角色
class WeddingCompany implements Marry{

    private Marry target;
    @Override
    public void happyMarry() {
        before();
        //这里是真实的对象
        this.target.happyMarry();
        after();
    }

    private void after() {
        System.out.println("结婚完成，婚庆公司收尾款");
    }

    private void before() {
        System.out.println("婚前准备，婚庆公司布置现场");
    }

    public WeddingCompany(Marry target){
        this.target = target;
    }
}