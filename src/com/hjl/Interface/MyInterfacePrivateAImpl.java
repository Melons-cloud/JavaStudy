package com.hjl.Interface;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {

    public void methodAnother(){
//直接访问到了接口中的默认方法.这是错误的。
    methodCommon();
    }
}
