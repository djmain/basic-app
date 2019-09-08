package com.jay.basic.net;

import org.junit.Test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

/**
 * created by Jay on 2019/8/8
 */
public class SocketTest
{
    @Test
    public void testServer()
    {
        //
        try
        {
            ServerSocket serverSocket = new ServerSocket(3307);
            Socket socket = serverSocket.accept();
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            Object name = inputStream.readObject();
            System.out.println(name);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject("Hello," + name);
            outputStream.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void testClient()
    {
        try
        {
            // 建立连接
            Socket socket = new Socket("localhost", 3307);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject("Jack");
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
            try
            {
                System.out.println(objectInputStream.readObject());
                objectInputStream.close();
                outputStream.close();
                socket.close();
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


}
