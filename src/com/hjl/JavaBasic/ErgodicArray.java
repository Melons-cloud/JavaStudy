package com.hjl.JavaBasic;

public class ErgodicArray {

    public static void main(String[] args) {


        String[] aves = new String[]{"白鹭","丹顶鹤","黄鹂","鹦鹉","乌鸦","喜鹊","布谷鸟","灰纹鸟","百灵鸟"};
        int index = 0;    //创建索引变量
        System.out.println("我的花园里面有很多鸟,种类大约包括: ");

        while (index<aves.length){

            System.out.println(aves[index++]);
        }
    }
}
