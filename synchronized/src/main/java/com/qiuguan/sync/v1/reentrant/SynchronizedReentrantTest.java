package com.qiuguan.sync.v1.reentrant;

/**
 * @author qiuguan
 * @date 2022/06/12 15:24:43  星期日
 */
public class SynchronizedReentrantTest {

    static final Object object = new Object();

    public static void main(String[] args) {
        synchronized (object){
            synchronized (object) {
                System.out.println("可重复锁");
            }
        }
    }
}
