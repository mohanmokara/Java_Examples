package CollectionFrameworksExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashsetExample 
{

	void meth1()
	{
		System.out.println("implementing the hashset");
		HashSet<Object> hs=new HashSet<>();
		hs.add(10);
		hs.add("java");
		hs.add(null);
		hs.add(true);
		hs.add(10);
		hs.add(100);
		hs.add(20);
		hs.add(1);
		System.out.println(hs);
		System.out.println("====================================");
		System.out.println("retriving the data by using iterator");
		
           Iterator<Object> i=hs.iterator();
           while(i.hasNext())
           {
        	   System.out.println(i.next());
           }
           System.out.println("====================================");
           System.out.println("retriving the data by using list iterator");
           ArrayList<Object>al=new ArrayList<Object>(hs);
           ListIterator<Object> i2=al.listIterator();
             while(i2.hasNext())
             {
            	 System.out.println(i2.next());
             }
             System.out.println("====================================");
             System.out.println("retriving the data in reverse order");
             while(i2.hasPrevious())
             {
            	 System.out.println(i2.previous());
             }
            
	}
	public static void main(String[] args) {
		new HashsetExample().meth1();
	}
}
