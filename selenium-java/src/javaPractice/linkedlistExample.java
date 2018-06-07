package javaPractice;

import java.util.LinkedList;
import java.util.PriorityQueue;


public class linkedlistExample {

	
	
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("List1");
		list.add("List2");
		System.out.println("after adding "+list);
		
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("queue1");
		queue.add("queue2");
		
		System.out.println("after adding queue"+queue);
		
		
		list.addFirst("zero");
		System.out.println("adding after addfirst :"+list);
		list.addLast("listLast");
		System.out.println("adding after addlast :"+list);
		list.offer("offer");
		System.out.println("adding offer :"+list);
		list.offerFirst("offerfirst");
		System.out.println("adding offer first :"+list);
		list.offerLast("offerlast");
		System.out.println("adding offer last :"+list);
		list.push("push");
		System.out.println("adding push :"+list);
		
	}
	
	
}
