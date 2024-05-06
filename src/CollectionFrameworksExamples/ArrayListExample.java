package CollectionFrameworksExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample 
{
void meth1()
{
	System.out.println("implementing the arraylist");
	 ArrayList<Object> al=new ArrayList<Object>();
	 al.add(10);
	 al.add("java");
	 al.add(null);
	 al.add(true);
	 al.add(10);
	 al.add(56);
	 al.add(1);
	 al.add(110);
	 System.out.println(al);
	 
	 System.out.println(al.get(5));
	 
	 System.out.println("retriving the data using for loop");
	 for(int i=0;i<al.size();i++)
	 {
		  System.out.print(al.get(i)+","+" ");
	 }
	 System.out.println();
	 
	 System.out.println("retriving the data using for loop in reverse order ");
	 for(int i=al.size()-1;i>=0;i--)
	 {
		 System.out.print(al.get(i)+","+" ");
	 }
	 System.out.println();
	 
	 System.out.println("retriving the data using the iterator");
	 Iterator<Object> i=al.iterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next() +" ");
	 }
	 System.out.println();
	 
	 System.out.println("retriving the data using enumeration");
	 
	 
}
public static void main(String[] args)
{
	new ArrayListExample().meth1();
}
}
