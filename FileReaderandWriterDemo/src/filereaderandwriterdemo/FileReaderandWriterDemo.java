package filereaderandwriterdemo;
import java.io.*;

public class FileReaderandWriterDemo 
{

    public static void main(String[] args) 
    {
try
{
FileReader fr = new FileReader ("F://temp.txt"); //reader use 2 bytes per time so it is slower
BufferedReader br= new BufferedReader(fr);
int i;
while((i=br.read())!=-1)
{
    System.out.print((char)i);
} 
br.close();
}
catch(Exception e)
{
    System.out.println(e);
}

try
{
FileWriter fw = new FileWriter ("F://temp1.txt"); //reader use 2 bytes per time so it is slower
BufferedWriter bw= new BufferedWriter(fw);
bw.write("This is my writer msg");

bw.close();
}
catch(Exception e)
{
    System.out.println(e);
}

    }
    
}
