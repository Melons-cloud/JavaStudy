package com.hjl.JavaBasic;

public class Select {

    public static void main(String[] args) {

        int r[] ={49,27,65,97,76,13,38,5,12,56};
        int i,j,index,temp;
        System.out.println("初始化序列的数组为: ");

        for (i=0;i<9;i++){

            System.out.print(r[i]+" ");
            index =i;
            for (j=i+1;j<10;j++){       //初始化第i趟选择排序的最小记录的指针

                if (r[j]<r[index]){

                    index=j;
                }

            }
            if (index!=i){

                temp=r[i];
                r[i]=r[index];
                r[index] = temp;

            }
        }

        System.out.println("\n排序好的数组为: ");

        for (i=0;i<10;i++){

            System.out.print(r[i]+" ");
        }

    }
}
