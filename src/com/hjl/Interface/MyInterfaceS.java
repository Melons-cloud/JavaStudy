package com.hjl.Interface;
/*
* 4个方法
* methodC
* methodD
* methodCommon
* method
*
*
*
* */
public interface MyInterfaceS extends MyInterfaceC,MyInterfaceD{
public abstract void method();

    @Override
    public default void methodDefault() {

    }
}

