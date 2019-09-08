package com.jay.basic.io;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * created by Jay on 2019/8/7
 */
public class PrintTest
{

    @Test
    public void testPrintWriter() throws IOException
    {
        PrintWriter writer = new PrintWriter(new FileWriter("D:\\a.txt"));
        writer.print("dj");
        writer.println();
        writer.print("haha");
        writer.write("kkk");
        writer.flush();
        writer.close();
    }

    @Test
    public void testPrintStream() throws IOException
    {
        PrintStream ps = new PrintStream("D:\\b.txt");
        char a = 'a';
        ps.write((int) a);
        ps.write("b".getBytes(StandardCharsets.UTF_8));
        ps.println();
        ps.println('c');
        ps.flush();
        ps.close();
        System.out.println("aa");
    }
}
