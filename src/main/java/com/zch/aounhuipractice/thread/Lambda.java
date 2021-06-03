package com.zch.aounhuipractice.thread;

public class Lambda {
    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda();

        like = new Like2();
        like.lambda();

        //第3种：局部内部类
        class Like3 implements ILike{

            @Override
            public void lambda() {
                System.out.println("i like lambda3");
            }
        }
        like = new Like3();
        like.lambda();

        //第4种：匿名内部类，没有类的名称，必须借助接口或者父类
        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("i like lambda4");
            }
        };

        like.lambda();
        //第5种：使用lambda简化
        like = () -> {
            System.out.println("i like lambda5");
        };
        like .lambda();

    }
    //第二种：静态内部类
     static class Like2 implements ILike{

        @Override
        public void lambda() {
            System.out.println("i like lambda2");
        }
    }
}

interface ILike{
    void lambda();
}

//第一种：
class Like implements ILike{

    @Override
    public void lambda() {
        System.out.println("i like lambda1");
    }
}