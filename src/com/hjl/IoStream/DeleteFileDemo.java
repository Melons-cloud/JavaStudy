package com.hjl.IoStream;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\杨永信");
        deleteFolder(file);
    }

    private static void deleteFolder(File file) {
        File[] files =file.listFiles();
        if (files!=null){
            for (File file1 :files){
                if (file1.isDirectory()){
                    deleteFolder(file1);
                }
                else {
                    file1.delete();
                }
            }
        }
        file.delete();
    }
}
