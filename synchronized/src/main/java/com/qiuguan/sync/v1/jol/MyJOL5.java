package com.qiuguan.sync.v1.jol;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author qiuguan
 * @date 2022/06/19 15:21:53  星期日
 */
public class MyJOL5 {

    public static void main(String[] args) {

        T t = new T();
        System.out.println(ClassLayout.parseInstance(t).toPrintable());
    }

    private static class T {
        //8byte
        long m;
    }
}
