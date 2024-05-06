package CollectionFrameworksExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class PriorityQueueExample
{
	void meth1()
	{
		System.out.println("implementing the prioritey queue");
		PriorityQueue<Object> pq=new PriorityQueue<Object>();
		pq.add(10);
		//pq.offer("java");
		pq.add(10);
		pq.offer(9);
		//pq.offer(null);
		pq.add(99);
		pq.add(123);
		pq.offer(1);
		//pq.offer(true);
		
		System.out.println(pq);
		System.out.println("=============================");
		System.out.println("removed by poll()="+pq.poll());
		System.out.println(pq);
		System.out.println("removed by remove()="+pq.remove());
		System.out.println(pq);
		System.out.println("=============================");
		 System.out.println(pq.peek());
		 System.out.println(pq);
		 
		 System.out.println("retriveing the data by using iterator method");
			Iterator<Object> i=pq.iterator();
		    while(i.hasNext())
		    {
		 	   System.out.println(i.next());
		    }
		    System.out.println("====================================");
		    
		    ArrayList<Object>al=new ArrayList<Object>(pq);
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
public static void main(String[] args) {
	new PriorityQueueExample().meth1();
}
}
