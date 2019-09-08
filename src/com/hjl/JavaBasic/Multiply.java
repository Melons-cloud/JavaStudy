package com.hjl.JavaBasic;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        //创建输入流
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入一个整数:");
        long number =scanner.nextLong(); //获取输入的整数
        System.out.println("你输入的整数是:"+number);
        System.out.println("该数字乘以2的运算结果为："+(number<<1));
        System.out.println("该数字乘以4的运算结果为: "+(number<<2));
        System.out.println("该数字乘以8的运算结果为: "+(number<<3));
        System.out.println("该数字乘以16的运算结果为: "+(number<<4));

        //执行左移运算n次，相当于这个整数乘以2的n次方
    }
}
