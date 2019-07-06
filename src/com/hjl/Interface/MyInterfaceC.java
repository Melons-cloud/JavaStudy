package com.hjl.Interface;

public interface MyInterfaceC {
    public abstract void methodC();
    public abstract void methodCommon();
    public default void methodDefault(){
        System.out.println("AAA");
    }
}
