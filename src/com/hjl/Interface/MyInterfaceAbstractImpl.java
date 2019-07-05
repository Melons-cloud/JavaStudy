package com.hjl.Interface;

public class MyInterfaceAbstractImpl implements MyinterfaceAbstract {

    public static void main(String[] args) {
       MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
       impl.mathodAbs1();
       impl.mathodAbs2();
       impl.mathodAbs3();
       impl.mathodAbs4();
    }
    @Override
    public void mathodAbs1() {
        System.out.println("这是第一个方法！");
    }

    @Override
    public void mathodAbs2() {

        System.out.println("这是第二个方法！");
    }

    @Override
    public void mathodAbs3() {

        System.out.println("这是第三个方法！");

    }

    @Override
    public void mathodAbs4() {
        System.out.println("这是第四个方法！");

    }
}
