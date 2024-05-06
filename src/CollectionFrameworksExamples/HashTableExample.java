package CollectionFrameworksExamples;

import java.util.Hashtable;

public class HashTableExample 
{
void meth1()
{
	System.out.println("implementing the HashTable");
	Hashtable<Object,Object> map=new Hashtable<Object,Object>();
	map.put(101, "java");
	//map.put(null, 102);
	//map.put("html", 103);
	map.put(104, "css");
	 map.put(109, "java script");
	map.put(103, "css");
	//map.put(null, null);
	map.put(101, 109);
	System.out.println(map);
}
public static void main(String[] args) {
	new HashTableExample().meth1();
}
}
