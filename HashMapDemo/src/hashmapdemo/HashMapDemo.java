package hashmapdemo;
import java.util.HashMap;
import java.util.Map; //map interface to use in for each loop

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

public class HashMapDemo {

    public static void main(String[] args) 
    {
Emp e1= new Emp(100,"Dhoni"); //setting key and string to class Emp
Emp e2= new Emp(200,"Virat");
HashMap<Integer,Emp> hm= new HashMap<Integer,Emp>(); //hashmap
hm.put(1,e1); //mapping 1st key with e1
hm.put(2,e2); //mapping 2nd key with e2

for (Map.Entry<Integer,Emp>m:hm.entrySet()) //setting hashmap hm to new map entry m
{
int i = m.getKey(); //get the key and set to i
Emp e= m.getValue();  // get value and set as Emp obj e

    System.out.println(i);  //key
    System.out.println(e.id); //obj to call Emp id
    System.out.println(e.name); //obj to call Emp name
    
}
    
    }
    
}
