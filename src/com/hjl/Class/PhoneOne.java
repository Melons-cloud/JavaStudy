package com.hjl.Class;

public class PhoneOne {     //根据类创建对象
    public static void main(String[] args){
        //根据Phone类创建一个名为one的对象
        //格式:类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand);  //默认值null
        System.out.println(one.price);  //默认值0.0
        System.out.println(one.color);  //默认值null\

        System.out.println("=======================");

        one.brand="苹果";
        one.price=8388.0;
        one.color="黑色";
        System.out.println(one.brand);  //苹果
        System.out.println(one.price);  //8388.0
        System.out.println(one.color);  //黑色
        System.out.println("================");
        one.call("乔布斯");
        one.sendMessage();

    }
}
