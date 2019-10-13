package com.hjl.JavaBasic;

import java.util.Scanner;

public class Hanio {

    private static void move(char x,char y){



        System.out.printf("%c-->%c",x,y);

        System.out.println("\n");

    }

    //讲n个盘子从第一座借助第二座移动到第三座

    private static void hanoit(int n,char one,char two,char three){

        if (n==1){

            move(one,three);
        }
        else {

            hanoit(n-1,one,three,two);   //将一上的盘子借助三移到二
            move(one,three);
            hanoit(n-1,two,one,three);   //将二上的盘子借助一移到三
        }
    }

    public static void main(String[] args) {



        int m;

        System.out.println("请输入你要移动的盘子数: ");

        Scanner scanner = new Scanner(System.in);
        m=scanner.nextInt();
        System.out.println("移动"+m+"个盘子的步骤如下");
        hanoit(m,'A','B','C');


    }



}
