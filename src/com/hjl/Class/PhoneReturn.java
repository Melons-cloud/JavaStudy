package com.hjl.Class;

public class PhoneReturn {
    public static void main(String[] args) {
        Phone two =getPhone();  //调用了getPhone()方法，因为里面有创建对象的方法，所以同时也就创建了对象two
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand="苹果";
        one.price=8388.0;
        one.color="玫瑰金";
        return one;

    }
}
