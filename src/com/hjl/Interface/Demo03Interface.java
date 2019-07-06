package com.hjl.Interface;

public class Demo03Interface {
    public static void main(String[] args) {

        MyInterfaceStaticImpl impl=new MyInterfaceStaticImpl();
//    impl.methodStatic();  //错误写法
        MyInterfaceStatic.methodStatic();

    }
}
