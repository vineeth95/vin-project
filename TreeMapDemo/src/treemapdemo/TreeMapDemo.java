package treemapdemo;

import java.util.Map;
import java.util.TreeMap;

class Emp
{
int id;
String name;
Emp(int i,String n) //parameterised constructor
{
id=i;
name=n;
}
}


public class TreeMapDemo {

    public static void main(String[] args) 
    {
   Emp e1= new Emp(100,null); //setting key and string to class Emp cant use null key but can use null value
Emp e2= new Emp(200,"Virat");
TreeMap<Integer,Emp> tm= new TreeMap<>(); //Treemap
tm.put(1,e1); //mapping 1st key with e1
tm.put(2,e2); //mapping 2nd key with e2

for (Map.Entry<Integer,Emp>m:tm.entrySet()) //setting Treemap hm to new map entry m
{
int i = m.getKey(); //get the key and set to i
Emp e= m.getValue();  // get value and set as Emp obj e

    System.out.println(i);  //key
    System.out.println(e.id); //obj to call Emp id
    System.out.println(e.name); //obj to call Emp name
    
}

    }
    
}
