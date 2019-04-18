package fileoutputdemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;


public class FileOutputDemo {
    public static void main(String[] args) 
    
    {
        try
        
        {
    FileOutputStream fo = new FileOutputStream("F://mynewfileio.txt"); //process it slower
    BufferedOutputStream bo = new BufferedOutputStream(fo); //process it faster
    String msg = ("My messages in a file");
    byte b[]=msg.getBytes();
    fo.write(b);
    fo.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }}
}
