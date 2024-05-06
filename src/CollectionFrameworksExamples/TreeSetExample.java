package CollectionFrameworksExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetExample
{
void meth1()
{
	System.out.println("implementing the treeset");
	TreeSet<Object> tm=new TreeSet<Object>();
	tm.add(1999);
	//tm.add("java");
	//tm.add(true);
	//tm.add(null);
	tm.add(10);
	tm.add(100);
	tm.add(105);
	
	System.out.println(tm);
	
	System.out.println("retriveing the data by using iterator method");
	Iterator<Object> i=tm.iterator();
    while(i.hasNext())
    {
 	   System.out.println(i.next());
    }
    System.out.println("====================================");
    System.out.println("retriving the data by using list iterator");
    ArrayList<Object>al=new ArrayList<Object>(tm);
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
    
    System.out.println("============methods======================");
    System.out.println(tm.headSet(100));
    System.out.println(tm.tailSet(105));
 
 
}
public static void main(String[] args) {
	new TreeSetExample().meth1();
}
}
