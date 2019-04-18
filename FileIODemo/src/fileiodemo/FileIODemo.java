package fileiodemo;
import java.io.*;

public class FileIODemo 
{
    public static void main(String[] args) 
    {
 try
 {
 FileOutputStream fo = new FileOutputStream("F://temp.txt");
 BufferedOutputStream bo = new BufferedOutputStream(fo);
 String msg = "My msg";
 byte b[]= msg.getBytes();
 bo.write(b);
 bo.close();
 
 FileInputStream fi = new FileInputStream("F://temp.txt");
 int a = 0;
 while ((a =fi.read())!= -1)
 {
     System.out.print((char)a);
 }
 fi.close();
 }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
