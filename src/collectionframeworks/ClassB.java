package collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ClassB
{
void meth1()
{
	System.out.println("======sorting of linked hashset=====");
	 
	LinkedList <Integer>ll=new LinkedList<Integer>();
	ll.add(12);
	ll.add(102);
	ll.add(56);
	ll.add(2);
	ll.add(19);
	ll.add(82);
	ll.add(31);
	System.out.println("before sorting"+ll);
	
	ArrayList al=new ArrayList<Integer>(ll);
Collections.sort(al);
System.out.println("after sorting:"+al);
	
}
public static void main(String[] args)
{
	ClassB dj=new ClassB();
	dj.meth1();
}
}
