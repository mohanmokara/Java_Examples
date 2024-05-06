package CollectionFrameworksExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashsetExample
{
void meth2()
{
	System.out.println("implementing the linkedhashset");
	LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();
	lhs.add(10);
	lhs.add("java");
	lhs.add(null);
	lhs.add(true);
	lhs.add(10);
	lhs.add(100);
	lhs.add(105);
	System.out.println(lhs);
	
	System.out.println("retriveing the data by using iterator method");
	Iterator<Object> i=lhs.iterator();
    while(i.hasNext())
    {
 	   System.out.println(i.next());
    }
    System.out.println("====================================");
    System.out.println("retriving the data by using list iterator");
     ArrayList<Object>al=new ArrayList<Object>(lhs);
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
public static void main(String[] args)
{
	new LinkedHashsetExample().meth2();
}
}