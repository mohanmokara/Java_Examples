package CollectionFrameworksExamples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashMapExample
{
void meth1()
{
	System.out.println("implementing the hashmap");
	HashMap<Object,Object> hm=new HashMap<>();
	hm.put(101, "java");
	hm.put(null, 102);
	hm.put("html", 103);
	hm.put(104, "css");
	hm.put("mohan", 105);
	hm.put("123", null);
	System.out.println(hm);
	
	HashSet<Object> hs=new HashSet<Object>(hm.keySet());
	System.out.println(hs);
	Iterator<Object> i=hs.iterator();
    while(i.hasNext())
    {
 	   System.out.println(i.next());
    }
    System.out.println("====================================");
    HashSet<Object> hs1=new HashSet<Object>(hm.entrySet());
	System.out.println(hs1);
	Iterator<Object> i1=hs1.iterator();
    while(i1.hasNext())
    {
 	   System.out.println(i1.next());
    }
    System.out.println("====================================");
}

public static void main(String[] args) 
{
new HashMapExample().meth1();	
}
}
