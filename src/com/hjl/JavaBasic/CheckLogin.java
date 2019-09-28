package com.hjl.JavaBasic;

import java.util.Scanner;

public class CheckLogin {

    public static void main(String[] args) {

        //创建扫描器
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入登陆用户名:  ");
        String username = scanner.nextLine();  //接收用户输入登陆名
        System.out.println("请输入登陆密码: ");
        String password =scanner.nextLine();   //接收用户输入密码
        //判断用户名的合法性
        if (!username.equals("胡金龙")){

            System.out.println("用户名非法，请重新输入!");

            //判断密码的合法性
        }else if (!password.equals("1urbtbri7")){
            System.out.println("密码非法,请重新输入!");
        }
        else {

            System.out.println("恭喜您，登陆成功!");
        }

    }
}
