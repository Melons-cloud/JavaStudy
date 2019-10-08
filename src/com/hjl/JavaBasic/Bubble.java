package com.hjl.JavaBasic;

public class Bubble {

    public static void main(String[] args) {

        int a[] ={10,23,11,56,45,26,59,28,84,79};   //给出原始数的排列
        int i,temp;
        System.out.println("初始序列的数组为: ");   //输出排序好的数序列
        for (i=0;i<10;i++){

            System.out.print(a[i]+"\n");
        }

        for (i=0;i<9;i++){

            if (a[i]>a[i+1]){   //进行比较，符合条件进行交换

                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;

            }
        }
        System.out.println("\n"+"排序好的数组为: ");   //输出排序好的数列
        for (i=0;i<10;i++){

            System.out.print(a[i]+ " ");

        }
    }
}
