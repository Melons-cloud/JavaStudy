package com.hjl.JavaBasic;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
    public static void main(String[] args) {
        try {
            PrintStream out =System.out;   //保存原输出流
            PrintStream ps =new PrintStream("./log.txt");  //创建文件输出流
            System.setOut(ps);  //设置使用新的输出流
            int age =18;   //定义整型变量
            System.out.println("年龄变量成功定义，初始值为18");
            String sex = "女";   //定义字符串变量
            System.out.println("字符串变量成功定义，初始值为女");
            //整合两个变量
            String info ="这是一个"+sex+"孩子,应该有"+age+"岁了";
            System.out.println("整合两个变量为info字符串变量,其结果是:"+info);
            System.setOut(out);  //恢复原输出
            System.out.println("程序运行完毕，清查看日志描述文件。");




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
