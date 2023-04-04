package com.qiuguan.sync.v1.voliate;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author qiuguan
 * @date 2022/07/21 19:31:45  星期四
 */
public class Atomic {

    public static void main(String[] args) {

        AtomicTask task = new AtomicTask();
        for (int i = 0; i < 100; i++) {
            new Thread(task, "线程 atomic-" + i).start();
        }
    }

    static class AtomicTask implements Runnable {

       private AtomicInteger atomicInteger = new AtomicInteger(0);

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                System.out.println(Thread.currentThread().getName() + " 的 count ---------->  " + atomicInteger.incrementAndGet());
            }
        }
    }
}
