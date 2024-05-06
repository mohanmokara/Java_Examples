package collectionframeworks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ClassD
{
	void meth1()
	{
		//HashMap<Object,Object> map=new HashMap<Object,Object>();
		LinkedHashMap<Object,Object> map=new LinkedHashMap<Object,Object>();
		map.put(1001, "html");
		map.put(1099, "devops");
		map.put("css", 400);
		map.put(1021, "javascript");
		
		System.out.println(map);
		
		System.out.println("===========================");
		
		System.out.println("retriving the data by using iterator");
		
		HashSet<Object> set=new HashSet<Object>(map.keySet());
		Iterator<Object> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("==========");
		 HashSet <Object> set1=new HashSet<Object>(map.entrySet());
		  Iterator<Object> i1=set1.iterator();
		  while(i1.hasNext())
		  {
			  System.out.println(i1.next());
			 //Entry e=(Entry)i1.next();
			 //System.out.println(e);
		  }
		
	}
public static void main(String[] args)
{
	ClassD dj=new ClassD();
	dj.meth1();
}
}
