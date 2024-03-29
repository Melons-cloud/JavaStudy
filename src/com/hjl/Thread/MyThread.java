package com.hjl.Thread;
/*
* 获取线程的名称:
* 1.使用Thread类中的方法getName()
* string getName()返回线程的名称。
*2.先获取当前正在执行的线程，再使用线程中的方法getName()获取线程的名称
* static Thread currentThread() 返回当前正在执行的线程对象的引用.
*设置线程的名称(了解)
* 1.使用Thread类中的方法setName(名字)
* void setName(String name)改变线程名称，使之与参数name相同。
* 2.创建一个带参数的构造方法，参数传递线程的名称，调用父类的带参构造方法，把线程名称传递给父类，让父类（Thread）给子线程起一个名字。
*  Thread(String name) 分配新的Thread对象.
* */

//定义一个Thread类的子类
public class MyThread extends Thread{
    //重写Thread类中的run方法，设置线程任务

    public MyThread(){


    }
public MyThread(String name){
super(name);   //把线程名称传递给父类，让父类(Thread)给子线程起一个名字
}

    @Override
    public void run(){
        //获取线程的名称
//        String name = getName();
//        System.out.println(name);
//        Thread thread = Thread.currentThread();
//        System.out.println(thread);
//
//        String name=thread.getName();
//        System.out.println(name);

        //链式编程
        System.out.println(Thread.currentThread().getName());



    }
}
