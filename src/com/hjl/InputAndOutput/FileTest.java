package com.hjl.InputAndOutput;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {
        File file =new File("world.txt");    //创建文件对象
        if (file.exists()){    //判断该文件是否存在

            file.delete();
            System.out.println("文件已被删除");
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
