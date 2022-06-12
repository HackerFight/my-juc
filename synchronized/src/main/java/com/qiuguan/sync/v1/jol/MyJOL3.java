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
public class MyJOL3 {

    public static void main(String[] args) throws Exception{

        //TODO:等待打开偏向锁
        Thread.sleep(5000);

        //TODO:此时是匿名偏向
        Object object = new Object();
        System.out.println(ClassLayout.parseInstance(object).toPrintable());

        //TODO: 在匿名偏向的基础上，在加一把锁
        //TODO:此时就会从匿名偏向---->偏向锁，偏向了当前的主线程
        synchronized (object) {
            System.out.println(ClassLayout.parseInstance(object).toPrintable());
        }
    }
}
