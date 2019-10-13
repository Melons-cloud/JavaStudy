package com.hjl.JavaBasic;

public class Wflower {

    public static void main(String[] args) {

        int a=0,b=0,c=0;
        System.out.println("水仙花数是: ");
        for (int i=100;i<1000;i++){

            a=i/100;   //取百位
            b=i%100/10;   //取十位
            c=i%100%10;   //取个位

            a=a*a*a;
            b=b*b*b;
            c=c*c*c;

            if (a+b+c==i){

                System.out.println(i);

            }

        }
    }
}
