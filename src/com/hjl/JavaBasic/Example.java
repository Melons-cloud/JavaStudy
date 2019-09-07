package com.hjl.JavaBasic;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个英文字符串或解密字符串:");
        String password =scanner.nextLine();   //获取用户输入
        char[] chars =password.toCharArray();   //获取字符串数组
        for (int i=0;i<chars.length;i++){
            chars[i]=(char)(chars[i]^2000);   //遍历字符串数组

        }
        System.out.println("加密结果如下：");
        System.out.println(chars);  //输出密钥

    }
}
