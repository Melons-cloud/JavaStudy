package com.hjl.JavaBasic;

public class Parti implements Main {

    public int partition(int[] r, int first, int end) {


        int i, j;   //初始化
        i = first;
        j = end;
        while (i < j) {

            while (i < j && r[i] <= r[j]) j--;   //右侧扫描
            if (i < j) {

                int temp;
                temp = r[i];
                r[i] = r[j];
                r[j] = temp;


            }
            while (i < j && r[i] < r[j]) {    //左侧扫描

                i++;
            }
            if (i < j) {    //将较大的记录交换到后面

                int temp;
                temp = r[i];
                r[i] = r[j];
                r[j] = temp;

            }

        }
        System.out.println(r[i]+"+"+r[j]);
        return i;


    }

}