package fileinputdemo;
import java.io.*; //imports all io packages

public class FileInputDemo 
{
    public static void main(String[] args) 
    {
try
{
FileInputStream fi =new FileInputStream("F://Core java syllabus.txt"); //it is slower
BufferedInputStream bi = new BufferedInputStream(fi); //use buffer to access faster
int i;
while((i=bi.read())!=-1)
        {
            System.out.print((char)i); //dont use println
        }
bi.close(); // close the file
}
catch(Exception e)
{
    System.out.println(e);
}
//to read all files in a folder
/*
File folder = new File("F://");
File[] listOfFiles = folder.listFiles();

for (File file : listOfFiles) {
    if (file.isFile()) {
        System.out.println(file.getName());
    }
}
  */  }
    
}
