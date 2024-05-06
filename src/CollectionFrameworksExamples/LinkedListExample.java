package CollectionFrameworksExamples;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample 
{
void meth1()
{
	System.out.println("implementing the linkedlist");
	 LinkedList<Object> ll=new LinkedList<Object>();
	 ll.add(10);
	 ll.add("java");
	 ll.add(true);
	 ll.add(null);
	 ll.add(10);
	 ll.add(100);
	 ll.add(102);
	 System.out.println(ll);
	 
	 System.out.println("retriving the data by using listiterator");
	 ListIterator<Object>i=ll.listIterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
	 
	 System.out.println("retriving the data by using listiterator");
	 while(i.hasPrevious())
	 {
		 System.out.println(i.previous());
	 }
	 
}
public static void main(String[] args)
{
	new LinkedListExample().meth1();
}
}
