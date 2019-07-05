package com.hjl.Interface;

public class Demo02Interface {
    public static void main(String[] args) {

        //创建实现类对象
        MyInterfaceDefaultA a =new MyInterfaceDefaultA();
        a.methodAbs();//调用抽象方法，实际运行的是右侧实现类

        a.methodDefault();
    }
}
