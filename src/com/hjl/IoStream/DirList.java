package com.hjl.IoStream;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirname ="C:\\Users\\Administrator\\Desktop\\杨永信";
        File file = new File(dirname);
        if (file.isDirectory()){
            System.out.println("目录"+dirname);
            String s[] =file.list();
            for (int i=0;i<s.length;i++){
                File file1 = new File(dirname+"/"+s[i]);
                if (file1.isDirectory()){
                    System.out.println(s[i]+"是一个目录");
                }else {
                    System.out.println(s[i]+"是一个文件");
                }

            }

        }else {
            System.out.println(dirname+"不是一个目录");
        }
    }
}
