package com.hjl.Thread;

public class Demo02SetThreadName {

    public static void main(String[] args) {
        //开启多线程
        MyThread myThread=new MyThread();
        myThread.setName("小强");
        myThread.start();

        new MyThread("旺财").start();
    }
}
