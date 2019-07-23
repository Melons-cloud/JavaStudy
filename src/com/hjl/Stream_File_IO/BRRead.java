package com.hjl.Stream_File_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        //使用System.in创建BufferReader
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符,按下'q'键退出");
        //读取字符
        do {
            c = (char) bufferedReader.read();
            System.out.println(c);
        }while (c!='a');
    }
}
