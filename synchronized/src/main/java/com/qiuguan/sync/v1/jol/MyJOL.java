package com.qiuguan.sync.v1.jol;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author qiuguan
 * @date 2022/06/12 15:24:43  星期日
 */
public class MyJOL {

    public static void main(String[] args) {

        Object object = new Object();
        System.out.println(ClassLayout.parseInstance(object).toPrintable());

        System.out.println("-------------------------------------------------------------");

        synchronized (object) {
            System.out.println(ClassLayout.parseInstance(object).toPrintable());
        }
    }
}
