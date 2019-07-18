package com.hjl.Thread;
/*
* 创建多线程程序实现Runnable接口
* java.lang.Runnable
*   Runnable接口应该由那些打算通过某一线程执行其实例来实现，类必须定义为一个称为run的无参数方法。
* java.lang.Thread方法
* Thread（Runnable target）分配新的Thread对象
* Thread(Runnable target,String name)分配新的Thread对象
*
* 实现步骤:
* 1.创建一个Runnable接口实现类
* 2.在实现类中重写Runnable接口的run()方法，设置线程任务
* 3.创建一个Runnable接口的实现类对象
* 4.创建Thread类对象,构造方法中传递Runnable端口的实现对象
* 5.调用Thread类中的start方法,开始新的线程执行run方法
*
*
* */
public class Demo01Runnable {
    public static void main(String[] args) {

        //创建一个Runnable接口实现类对象
        RunnableImpl run =new RunnableImpl();

        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t = new Thread(run);

        //调用Thread类中的start方法,开启新的线程执行run方法
        t.start();
        for (int i=0;i<20;i++){

            System.out.println(Thread.currentThread().getName()+"-->"+i);

        }
    }

}
