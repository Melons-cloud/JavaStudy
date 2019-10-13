package com.hjl.JavaBasic;

import java.util.Scanner;

public class Fbo {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想查看的斐波那契数列: ");
        int num=scanner.nextInt();
        System.out.println("你想看的斐波那契数列: ");
        f(num/2+1);
    }
    private static void f(int x){

        int f1=1,f2=2,i=3;
        if (x==1) System.out.println(f1);
        if (x==2) System.out.println(f1+""+f2);
        if (x>=3){

            System.out.println(f1+""+f2);
            while (x>=i){

                f1=f2+f1;
                System.out.print(" "+f1);
                i++;
                f2=f2+f1;
                System.out.print(" " +f2);
            }
        }
    }
}
