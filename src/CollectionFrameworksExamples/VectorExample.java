package CollectionFrameworksExamples;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample 
{
void meth1()
{
System.out.println("implemeting the vector");
Vector<Object> v=new Vector<Object>();
v.add(10);
v.add("java");
v.add(null);
v.add(true);
v.add(10);
v.add(16);
v.add(100);
v.add(1);

System.out.println(v);
System.out.println(v.size());
System.out.println(v.capacity());
System.out.println("retriving the data vector class by using the enumeration interface");
  Enumeration<Object> e=v.elements();
  while(e.hasMoreElements())
  {
	  System.out.println(e.nextElement() );
  }
v.add(22);
v.add(44);
v.add(990);
System.out.println(v.size());
System.out.println(v.capacity());
}
public static void main(String[] args) 
{
	new VectorExample().meth1();
}
}
