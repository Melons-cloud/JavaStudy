package com.hjl.Thread;
/*
* �����ڲ��෽ʽʵ���̵߳Ĵ���
* ������û������
* �ڲ��ࣺд�������ڲ�����
*
* �����ڲ������ã��򻯴���
*   ������̳и��࣬��д����ķ�����������������һ�����
*   ��ʵ����ʵ�ֽӿڣ���д�ӿ��еķ���������ʵ�������ϳ�һ�����
* �����ڲ�������ղ������ʵ�ֶ��󣬶������û������
*
* ��ʽ��
*   new ����/�ӿ�(){
*
*       ��д����/�ӿ��еķ���
* };
*
* */
public class Demo01InnerClassThread {
    public static void main(String[] args) {
        //�̵߳ĸ�����Thread
        //new MyThread()��start();
        new Thread(){

            //��дrun�����������߳�����
            @Override
            public void run(){
                for (int i=0;i<20;i++){

                    System.out.println(Thread.currentThread().getName()+"--->"+"����");

                }

            }
        }.start();


        //�̵߳Ľӿ�Runnable
        //RunnableImpl r = new RunnableImpl();  //��̬
       Runnable runnable= new Runnable(){

            //��дrun�����������߳�����
            @Override
            public void run(){

                for (int i=0;i<20;i++){

                    System.out.println(Thread.currentThread().getName()+"--->"+"����Ա");

                }

            }
        };
       new Thread(runnable).start();

       //�򻯽ӿڵķ�ʽ
        new Thread(new Runnable(){

            //��дrun�����������߳�����
            @Override
            public void run() {

                for (int i = 0; i < 20; i++) {

                    System.out.println(Thread.currentThread().getName() + "--->" + "���ǲ���");

                }
            }
            }).start();
    }
}
