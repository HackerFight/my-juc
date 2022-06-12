package com.qiuguan.sync.v1.jol;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author qiuguan
 * @date 2022/06/12 17:07:36  星期日
 */
public class MyJOL2 {

    public static void main(String[] args) {

        Student student = new Student("qiuguan", 26);
        System.out.println(ClassLayout.parseInstance(student).toPrintable());
    }


    static class Student{

        private byte[] buffer = new byte[13];
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
