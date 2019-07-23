package com.hjl.Stream_File_IO;

import java.io.*;

public class FileStreamTest {
    public static void main(String[] args)  {
        try {
            byte bWrite[] ={11,21,3,40,5};
            OutputStream outputStream = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\test.txt");
            for (int x= 0;x<bWrite.length;x++){
                outputStream.write(bWrite[x]);  //writes the bytes
            }
            outputStream.close();
            InputStream inputStream = new FileInputStream("test.txt");
            int size = inputStream.available();
            for (int i=0;i<size;i++){
                System.out.print((char) inputStream.read()+" " );
            }
            inputStream.close();
        }catch (IOException e){
            System.out.println("IOException");
        }
    }
}
