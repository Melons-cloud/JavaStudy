package com.hjl.JavaBasic;
import java.io.*;
public class SerializeDemo {

    public static void main(String[] args) {

       Employee e = new Employee();
       e.name="Reyan Ali";
       e.address="Phokka Kuan,Ambehta Peer";
       e.SSN =11122333;
       e.number=101;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(e);
            outputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved in /tmp/employee.ser");
            } catch (IOException i) {
                i.printStackTrace();
            }


        }


}
