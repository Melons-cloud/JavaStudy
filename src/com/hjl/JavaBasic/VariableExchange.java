package com.hjl.JavaBasic;

import java.util.Scanner;

public class VariableExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //创建输入流
        System.out.print("请输入变量A的值:");
        long A =scanner.nextLong(); //接收第一个变量值
        System.out.print("请输入变量B的值:");
        long B = scanner.nextLong(); //接收第二个变量值
        System.out.println("A="+A+"\tB="+B);
        System.out.println("执行变量互换.....");
        A=A^B;
        B=B^A;
        A=A^B;
        System.out.println("A="+A+"\tB="+B);
    }
}
