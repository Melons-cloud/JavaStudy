package com.hjl.JavaBasic;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GreetingServer extends Thread {

    private ServerSocket serverSocket;
    public GreetingServer(int port) throws IOException{

        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }
    public void run(){

        while (true)
        {

            try {
                System.out.println("等待远程连接,端口号: "+serverSocket.getLocalPort()+"......");
                Socket server =serverSocket.accept();
                System.out.println("远程主机地址: "+server.getRemoteSocketAddress());
                DataInputStream dataInputStream =new DataInputStream(server.getInputStream());
                System.out.println(dataInputStream.readUTF());
                DataOutputStream dataOutputStream = new DataOutputStream(server.getOutputStream());
                dataOutputStream.writeUTF("谢谢你连接我: " +server.getLocalAddress()+"\nGood bye!");
                server.close();
            }catch (IOException e) {
                e.printStackTrace();
            }


        }


    }


    public static void main(String[] args) {

        int port = Integer.parseInt(args[0]);
        try{
            Thread thread = new GreetingServer(port);
            thread.run();

        } catch (IOException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }


    }
}
