package com.qiuguan.sync.v1.jol;

import org.openjdk.jol.info.ClassLayout;

/**
 * 演示匿名偏向--->偏向锁
 * @author qiuguan
 * @date 2022/06/12 15:24:43  星期日
 *
 *  偏向锁默认是关闭的，JVM启动4s后会打开偏向锁
 *
 *  或者设置JVM参数：使其启动时就打开偏向锁
 *  -XX:BiasedLockingStartupDelay=0
 */
public class MyJOL4 {

    public static void main(String[] args) throws Exception{

        //TODO:此时是无锁
        Object object = new Object();
        System.out.println(ClassLayout.parseInstance(object).toPrintable());

        //TODO:等待打开偏向锁
        Thread.sleep(5000);

        //TODO: 无锁-----打开偏向锁----加锁 会如何?
        //TODO: 并没有出现  无锁 ---> 偏向锁 ，而是直接 无锁---> 轻量级锁
        synchronized (object) {
            System.out.println(ClassLayout.parseInstance(object).toPrintable());
        }
    }
}
