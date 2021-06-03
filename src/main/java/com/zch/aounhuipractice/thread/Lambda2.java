package com.zch.aounhuipractice.thread;

/**
 * lambda的过程即为new Instance()
 */
public class Lambda2 {
    public static void main(String[] args) {
        ILove love = new Love();
        love.love(0);

        love = new Love1();
        love.love(1);

        class Love3 implements ILove{
            @Override
            public void love(int number) {
                System.out.println("i love you " + number);
            }
        }
        love = new Love3();
        love.love(3);

        love = new ILove() {
            @Override
            public void love(int number) {
                System.out.println("i love you " + number);
            }
        };
        love.love(4);

        //lambda简化
        love = (int number) -> {
            System.out.println("i love you " + number);
        };
        //1,去掉参数类型
        love = (number) -> {
            System.out.println("i love you " + number);
        };
        //2,简化括号
        love = number -> {
            System.out.println("i love you " + number);
        };
        //3，简化花括号，如果方法体有多行就不能简化花括号
        love = number -> System.out.println("i love you " + number);
        //总结：前提接口为函数式接口（只能有一个方法）
        love.love(5);

    }
    static class Love1 implements ILove{
        @Override
        public void love(int number) {
            System.out.println("i love you " + number);
        }
    }
}

interface ILove{
    void love(int number);
}
class Love implements ILove{
    @Override
    public void love(int number) {
        System.out.println("i love you " + number);
    }
}