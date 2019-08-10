package com.hjl.InputAndOutput;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {
        File file =new File("world.txt");    //创建文件对象
        if (file.exists()){    //判断该文件是否存在

            String name =file.getName();  //获取文件名称
            long length =file.length();  //获取文件长度
            boolean hidden =file.isHidden();  //判断文件是否为隐藏文件
            System.out.println("文件名称:"+name);
            System.out.println("文件长度:"+length);
            System.out.println("该文件是否为隐藏文件?"+hidden);

        }else {

            try {
                file.createNewFile();   //创建该文件
                System.out.println("文件已创建");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
