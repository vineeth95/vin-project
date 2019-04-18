package ipfinder;

import java.net.InetAddress;

public class IPFinder 
{
    public static void main(String[] args) 
    
    {
try
{
InetAddress i = InetAddress.getByName("www.fb.com");
    System.out.println("Host Name: "+i.getHostName());
    System.out.println("IP address :" + i.getHostAddress());
}
catch(Exception e)
{
    System.out.println(e);
}    
    
    }
    
}
