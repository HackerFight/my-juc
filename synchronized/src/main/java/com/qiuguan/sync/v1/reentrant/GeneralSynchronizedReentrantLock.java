package com.qiuguan.sync.v1.reentrant;

/**
 * @author qiuguan
 * @date 2022/06/12 15:36:15  星期日
 */
public class GeneralSynchronizedReentrantLock extends SynchronizedReentrantLock {

    @Override
    public synchronized void run() {
        super.run();
    }
}
