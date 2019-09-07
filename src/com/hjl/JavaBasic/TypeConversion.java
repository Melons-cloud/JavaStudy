package com.hjl.JavaBasic;

public class TypeConversion {
    public static void main(String[] args) {
        byte b =-127;
        char c ='W';
        short s =23561;
        int i =3333;
        long l =400000L;
        float f =3.14159F;
        double d = 54.523;

        //低类型向高类型自动转换
        System.out.println("累加byte等于:"+b);
        System.out.println("累加char等于:"+(c+b));
        System.out.println("累加short等于:"+(s+c+b));

        System.out.println("累加int等于:"+(i+s+c+b));
        System.out.println("累加long等于:"+(l+i+s+c+b));
        System.out.println("累加float等于"+(f+l+i+s+c+b));
        System.out.println("累加double等于:"+(d+f+l+i+s+c+b));
        System.out.println("把long强制类型转换为int:"+(int)l);  //高类型到低类型的强制转换
        System.out.println("把int强制转换为short:"+(short)i);   //高类型到低类型转换会丢失数据
        System.out.println("把double强制转换为int:"+(int)d);    //实数到整数转换会舍弃小数部分
        System.out.println("把short强制类型转换为char:"+(char)s);  //整数到字符类型的转换将获取对应编码的字符


    }
}
