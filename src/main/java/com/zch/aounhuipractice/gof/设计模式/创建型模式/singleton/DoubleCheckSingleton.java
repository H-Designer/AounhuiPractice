package com.zch.aounhuipractice.gof.设计模式.创建型模式.singleton;

/**
 * 双重检查
 * 解决线程安全问题
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton doubleCheckSingleton;
    private DoubleCheckSingleton(){}//保证私有化，不被外部new创建实例
    public static synchronized DoubleCheckSingleton getInstance(){
        if (doubleCheckSingleton == null){
            synchronized (DoubleCheckSingleton.class){
                if (doubleCheckSingleton == null){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
