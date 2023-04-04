package com.qiuguan.sync.v1.voliate;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author qiuguan
 * @date 2022/06/19 15:21:53  星期日
 */
public class MyJOLTest {

    public static volatile boolean flag = true;

    public static void main(String[] args) {


        Thread.currentThread();
        System.out.println(flag);
    }

}
