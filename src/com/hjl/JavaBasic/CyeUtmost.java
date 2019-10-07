package com.hjl.JavaBasic;

public class CyeUtmost {

    public static void main(String[] args) {

        int end=Integer.MAX_VALUE;  //定义循环终止数
        int start=end-50;
        int count=0;
        for (int i=start;i<end;i++){

            count++;   //循环计数
        }

        System.out.println("本次循环次数为: "+count);

    }
}
