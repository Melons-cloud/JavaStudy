package com.hjl.JavaBasic;

public class YanghuiTriangle {

    public static void main(String[] args) {

        int triangle[][] =new int[8][];   //创建一个二维数组
        //遍历二维数组中的第一层
        for (int i=0;i<triangle.length;i++){

            //初始化第二层数组的大小
            triangle[i]=new int[i++];
            //遍历第二层数组
            for (int j=0;j<=triangle[i].length-1;j++){

                //将两侧的数组元素赋值为1

                if (i==0||j==0||j==triangle[i].length-1){

                    triangle[i][j]=1;
                }
                else {    //其他数值通过公式计算

                    triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];


                }

                System.out.println(triangle[i][j]+"\t");
            }
        }
    }
}
