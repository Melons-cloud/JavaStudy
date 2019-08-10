package com.hjl.InputAndOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {
        File file =new File("world.txt");    //创建文件对象


            try {
               //创建FileOutputStream对象
                FileOutputStream fileOutputStream =new FileOutputStream(file);

                //创建byte型数组
                byte buy[] ="我有一只小毛驴，我一直都不骑。".getBytes();
                //将数组中的信息写入到文件中
                fileOutputStream.write(buy);
                //关闭流
                fileOutputStream.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {

                //创建FileInputStream类对象
                FileInputStream fileInputStream  =new FileInputStream(file);
                //创建byte数组
                byte byt[] = new byte[1024];
                //从文件中读取信息
                int len = fileInputStream.read(byt);
                //输出文件信息
                System.out.println("文件的信息是:"+new String(byt,0,len));
                //关闭流
                fileInputStream.close();


        }catch (Exception e){
                e.printStackTrace();
            }
    }
}
