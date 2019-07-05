package com.hjl.Class;
/*
局部变量和成员变量：
1.定义的位置不一样
局部变量在方法的内部，成员变量在方法的外面，直接写在类当中
2.作用范围不一样
局部变量只有在方法当中才可以使用，出了方法不能再用
成员变量，整个类都可以通用
3.默认值不一样
局部变量，没有默认值，如果要想使用，必须手动进行赋值
成员变量，如果没有赋值，会有默认值，规则和数组一样
4.内存的位置不一样
局部变量，位于栈内存
成员变量，位于域内存
5.生命周期不一样
局部变量，随着方法进栈而诞生，随着方法出栈而消失
成员变量,随着对象创建而诞生，随着对象被垃圾回收而消失
        */
public class VariableDiffrence {


    String name;//成员变量,默认值为空

    public void methodA(){
        int num=20;    //局部变量
        System.out.println(num);
        System.out.println(name);
    }
    public void methodB(int param){ //方法的参数为局部变量
        //参数在方法调用的时候，必然会被赋值。
        System.out.println(param);
        int age;    //没有默认值
//        System.out.println(age);    //没赋值不能用
//        System.out.println(num);    //错误写法
        System.out.println(name);
    }

}
