package com.qiuguan.sync.v1.reentrant;

/**
 * @author qiuguan
 * @date 2022/06/12 15:32:57  星期日
 */
public class SynchronizedReentrantLock {

    public synchronized void run() {
        System.out.println("父类的synchronized方法");
    }
}
