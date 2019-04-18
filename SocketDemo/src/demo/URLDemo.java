package demo;

import java.net.*;
import java.util.Scanner;


public class URLDemo 

{

    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the URL...");
        String url = s.nextLine();
try
    {
    URL u = new URL("https://"+url);

      InetAddress ip = InetAddress.getByName(url);
        System.out.println("Host Name :"+u.getHost());
    System.out.println("Port :"+u.getPort());
    System.out.println("Protocol :"+u.getProtocol());
    System.out.println("File :"+u.getFile());
       System.out.println("IP :"+ip);
    
    
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    
}
