package com.hjl.JavaBasic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //创建输入流
        System.out.print("请输入一个年份: ");
        long year = scanner.nextLong();  //接收用户输入
        if (year%4==0&&year%100!=0||year%400==0){

            System.out.println(year+"是闰年！");

        }
        else {

            System.out.println(year+"不是闰年!");
        }
    }
}
