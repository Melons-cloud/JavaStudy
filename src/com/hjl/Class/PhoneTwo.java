package com.hjl.Class;

public class PhoneTwo {

public static void main(String[] args) {
    //根据Phone类创建一个名为one的对象
    //格式:类名称 对象名 = new 类名称();
    Phone one = new Phone();
    System.out.println(one.brand);  //默认值null
    System.out.println(one.price);  //默认值0.0
    System.out.println(one.color);  //默认值null\

    System.out.println("=======================");

    one.brand = "苹果";
    one.price = 8388.0;
    one.color = "黑色";
    System.out.println(one.brand);  //苹果
    System.out.println(one.price);  //8388.0
    System.out.println(one.color);  //黑色
    System.out.println("================");
    one.call("乔布斯");
    one.sendMessage();

    Phone two = new Phone();
    System.out.println(one.brand);  //默认值null
    System.out.println(one.price);  //默认值0.0
    System.out.println(one.color);  //默认值null\

    System.out.println("=======================");

    one.brand = "三星";
    one.price = 5999.0;
    one.color = "蓝色";
    System.out.println(one.brand);  //苹果
    System.out.println(one.price);  //8388.0
    System.out.println(one.color);  //黑色
    System.out.println("================");
    one.call("欧巴");
    two.sendMessage();
}
}