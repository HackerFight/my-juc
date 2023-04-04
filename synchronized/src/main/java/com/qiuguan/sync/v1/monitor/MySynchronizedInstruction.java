package com.qiuguan.sync.v1.monitor;

/**
 * @author qiuguan
 * @date 2022/06/18 17:16:00  星期六
 * synchronized 底层指令
 */
public class MySynchronizedInstruction {

    /**
     * 关键字在方法上
     */
    public synchronized void test1(){

    }

    public void test2(){
        synchronized (this){
            System.out.println("synchronized 作用在块上");
        }
    }

    public static void main(String[] args) {
        MySynchronizedInstruction my = new MySynchronizedInstruction();
        my.test1();
        my.test2();
    }
}
