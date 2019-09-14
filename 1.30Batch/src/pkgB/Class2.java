package pkgB;

import java.util.*;

import pkgA.Class1;

public class Class2
{
 public static void main(String[] args)
 {
   TreeMap<String, String> hm=new TreeMap<String,String>();
   hm.put("23","deepak");
   hm.put("34", "deep");
   hm.put("12","abc");
   hm.put("1","abcc");
   hm.put("2222","xyz");
   hm.put("22","xyz");
   hm.put("2222", null);
   hm.put("222255", null);
   
   
    Set<String> all=  hm.keySet();  // stored all the keys in set of Integer
    
    for(String i : all)
    {
    	System.out.println("key is "+i);
    	System.out.println("value is "+hm.get(i));
    }
    
    
 }
}
