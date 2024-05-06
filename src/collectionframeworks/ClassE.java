package collectionframeworks;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class ClassE 
{
	void meth1()
	{
		Hashtable<Object,Object> ht=new Hashtable<Object,Object>();
		ht.put("html", 100);
		ht.put("sql", 100);
		ht.put(3000, "hiii");
		ht.put("java", 100);
		
		System.out.println(ht);
		System.out.println("===========================================");
		System.out.println("retriving the data using iterator method");
		System.out.println("---------------------------------------------");
		HashSet<Object> set=new HashSet<Object>(ht.entrySet());
		 Iterator i=set.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
			 Entry e=(Entry)i.next();
			 System.out.println(e.getValue());
		 }
		
		System.out.println("========================="); 
		 HashSet<Object> set1=new HashSet<Object>(ht.keySet());
		 Iterator i2=set1.iterator();
		 while(i2.hasNext())
		 {
			 System.out.println(i2.next());
		 }
		
	}
public static void main(String[] args) 
{
  ClassE dj=new ClassE();
  dj.meth1();
}
}
