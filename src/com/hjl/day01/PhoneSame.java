package com.hjl.day01;

public class PhoneSame {

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

    one.call("乔布斯");
    one.sendMessage();
    System.out.println("================");
    Phone two = one;    //将one当中保存的对象地址值赋值给two
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