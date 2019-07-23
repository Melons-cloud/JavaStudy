package com.hjl.Stream_File_IO;

import java.io.*;

public class FileStreamTest2 {
    public static void main(String[] args) throws IOException{
        File file =new File("C:\\Users\\Administrator\\Desktop\\a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //构建FileOutputStream对象,文件不存在会自动新建

        OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream,"UTF-8");
        //构建OutputStreamWriter对象，参数可以指定编码，默认为操作系统编码，windows上是gbk.

        writer.append("中文输入");
        //写入到缓冲区

        writer.append("\r\n");
        //换行
        writer.append("English");
        //刷新缓存冲，写入到文件，如果下面已经没有写入的内容了，直接close也会写入
        writer.close();
        //关闭写入流，同时会把缓冲区内容写入文件，所以上面的注释掉
        fileOutputStream.close();
        //关闭输出流，释放系统资源
        FileInputStream fileInputStream =new FileInputStream(file);
        //构建FileInputStream对象

        InputStreamReader inputStreamReader =new InputStreamReader(fileInputStream,"UTF-8");
        //构建InputStreamReader对象，编码与写入相同

        StringBuffer stringBuffer = new StringBuffer();
        while (inputStreamReader.ready()){
            stringBuffer.append((char) inputStreamReader.read());
            //转成char加到StringBuffer对象中
        }
        System.out.println(stringBuffer.toString());
        inputStreamReader.close();
        //关闭读取流

        fileInputStream.close();
        //关闭输入流，释放系统资源

    }
}
