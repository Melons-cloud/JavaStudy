package com.hjl.Interface;
/*
* 问题描述：
* 我们需要抽取一个公共方法，用来解决默认方法之间重复代码的问题。
*但是这个共有方法不应该让实现类使用。应该是私有化的。
*解决方法:
* 从java9开始，接口当中允许定义私有方法。
* 1.普通私有方法，解决多个默认方法之间重复代码问题
* 格式：
* private 返回值类型 方法名称（参数列表）{
* 方法体}
* 2.静态私有方法，解决多个静态方法之间重复代码问题。
* private static 返回值类型 方法名称（参数列表）{
* 方法体
* }
*
* */
public interface MyInterfacePrivateA {
    public default void methodDefault1(){

        System.out.println("默认方法1!");
        methodCommon();
    }
    public default void methodDefault2(){

        System.out.println("默认方法2!");
        methodCommon();

    }
    static void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
