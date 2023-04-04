package com.qiuguan.sync.v1.voliate;

/**
 * @author qiuguan
 * @date 2022/07/21 19:31:45  星期四
 */
public class AtomicVolatile {

    public static void main(String[] args) {

        AtomicTask task = new AtomicTask();
        for (int i = 0; i < 100; i++) {
            new Thread(task, "线程 atomic-" + i).start();
        }
    }

    static class AtomicTask implements Runnable {

        private volatile int count= 0;

        @Override
        public void run() {
            synchronized (AtomicTask.class) {
                for (int i = 0; i < 10000; i++) {
                    count++;
                    System.out.println(Thread.currentThread().getName() + " 的 count ---------->  " + count);
                }
            }
        }
    }
}
