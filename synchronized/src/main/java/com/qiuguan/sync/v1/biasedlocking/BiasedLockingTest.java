package com.qiuguan.sync.v1.biasedlocking;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author qiuguan
 * @date 2022/06/12 16:45:16  星期日
 *
 * 偏向锁默认是关闭的，JVM启动4s后会打开偏向锁
 *
 * 或者设置JVM参数：使其启动时就打开偏向锁
 *  -XX:BiasedLockingStartupDelay=0
 */
public class BiasedLockingTest {

    public static void main(String[] args) throws Exception {

        Object o1 = new Object();

        System.out.println(ClassLayout.parseInstance(o1).toPrintable());

        //TODO:让JVM运行5s
        Thread.sleep(5000);

        Object o2 = new Object();
        System.out.println(ClassLayout.parseInstance(o2).toPrintable());

    }
}
