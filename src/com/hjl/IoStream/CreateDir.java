package com.hjl.IoStream;

import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        String dirname ="C:\\Users\\Administrator\\Desktop\\杨永信";
        File d = new File(dirname);
        d.mkdirs();
    }
}
