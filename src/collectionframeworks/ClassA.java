package collectionframeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClassA 
{
void meth1()
{
	System.out.println("============sorting  the data============");
	int arr[]= {12,10,13,40,57,89,60,};
	System.out.println("before sorting  "+Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println("after sorting "+Arrays.toString(arr));
	
}
void meth2()
{
	System.out.println("===============array list==========");
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(87);
	al.add(47);
	al.add(56);
	al.add(8);
	al.add(17);
	al.add(887);
	al.add(7);
	al.add(28);
	
	System.out.println("before sorting "+al);
	Collections.sort(al);
	System.out.println("after sorting "+al);
	
	}
public static void main(String[] args)
{
	ClassA dj=new ClassA();
	//dj.meth1();
	dj.meth2();
}
}
