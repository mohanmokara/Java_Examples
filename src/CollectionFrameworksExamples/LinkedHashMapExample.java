package CollectionFrameworksExamples;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashMapExample
{
void meth1()
{
	System.out.println("implementing the linkedhashmap");
	LinkedHashMap<Object,Object> lhm=new LinkedHashMap<>();
	lhm.put(101, "java");
	lhm.put(null, 102);
	lhm.put("html", 103);
	lhm.put(104, "css");
	lhm.put(null, 105);
	lhm.put(103, "css");
	lhm.put(null, null);
	System.out.println(lhm);
	
	LinkedHashSet<Object> lsm=new LinkedHashSet<Object>(lhm.entrySet());
	 //lhm.iterator();
}
public static void main(String[] args) {
	new LinkedHashMapExample().meth1();
}
}
