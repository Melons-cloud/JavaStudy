package com.hjl.IoStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        //使用System.in创建BufferdReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str =bufferedReader.readLine();
            System.out.println(str);
        }while (!str.equals("end"));
    }
}
