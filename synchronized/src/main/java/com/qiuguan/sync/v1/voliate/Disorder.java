package com.qiuguan.sync.v1.voliate;

/**
 * @author qiuguan
 * @date 2022/06/12 15:24:43  星期日
 *
 * 如果不考虑乱序：
 * 是不可能出现x=0,y=0的
 *  可以先执行线程1的 a=1, 然后执行线程1的 x=b
 *  可以先执行线程1的 a=1, 然后执行线程2的 b=1
 *  可以先执行线程2的 b=1, 然后执行线程2的 y=a
 *  可以先执行线程2的 b=1, 然后执行线程1的 a=1
 *  ......
 *  总之就是不会先执行 x = b 或者 y = a
 *
 *
 *  那么我们运行下程序：
 *
 */
public class Disorder {
    private volatile static int x = 0, y = 0;
    private volatile static int a = 0, b =0;

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        for(;;) {
            i++;
            x = 0; y = 0;
            a = 0; b = 0;
            Thread t1 = new Thread(() -> {
                a = 1;
                x = b;
            });

            Thread t2 = new Thread(() -> {
                b = 1;
                y = a;
            });

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            String result = "第 " + i + " 次 (x, y) = (" + x + "," + y + "）";

            if(x == 0 && y == 0) {
                System.err.println(result);
                break;
            } else {
                //System.out.println(result);
            }
        }
    }
}