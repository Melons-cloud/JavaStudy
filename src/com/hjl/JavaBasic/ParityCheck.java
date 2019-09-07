package com.hjl.JavaBasic;

import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);   //创建输入流
        System.out.println("请输入一个参数: ");
        long number=scanner.nextLong();  //获取用户输入的整数
        String check =(number%2==0?"这个数是:整数":"这个数是:奇数");
        System.out.println(check);


    }
}
