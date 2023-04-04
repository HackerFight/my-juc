package com.qiuguan.sync.v1.singleton;

/**
 * @author qiuguan
 * @date 2022/07/22 18:54:22  星期五
 */
public class Singleton {

    //TODO:一定要加上volatile关键字
    private volatile static Singleton INSTANCE;

    //构造器私有
    private Singleton(){

    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    //TODO:注意：非原子操作
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
