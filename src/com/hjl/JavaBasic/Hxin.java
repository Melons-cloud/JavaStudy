package com.hjl.JavaBasic;

public class Hxin {

    public static void main(String[] args) {

        int a=0,b=0,c=0,person;
        for (person=0;person<100;person++){

            a=person%3;   //每排三人的剩余人数
            b=person%5;   //每排五人的剩余人数
            c=person%7;   //每排七人的剩余人数



        if (a==1&&b==0&&c==5){    //都符合条件的人数

            System.out.println("韩信带兵的人数是: "+person);

        }
    }
}
}