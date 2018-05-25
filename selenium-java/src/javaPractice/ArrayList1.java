package javaPractice;
import java.util.*; 


public class ArrayList1 {


	public static void main(String args[]) {
		
		
		/**
		 * //Example 1: simple arraylist
		 */
		
		/*ArrayList<String> list = new ArrayList<String>();
		list.add("first");
		list.add("second");
		list.add("third");


		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println("testing: "+itr.next());     
		}

		for(String obj:list)
		{
			System.out.println("testing: "+obj);     
		}*/
		
		
		
		/**
		 * Example 2: UserDefined arraylist
		 */
		/*userdefinedArrayList user1=new userdefinedArrayList(1,"user1");
		
		userdefinedArrayList user2=new userdefinedArrayList(2,"user2");
		
		ArrayList<userdefinedArrayList> list2=new ArrayList<userdefinedArrayList>();
		
		list2.add(user1);
		list2.add(user2);
		
		Iterator<userdefinedArrayList> itr2=list2.iterator();
		while(itr2.hasNext())
		{
			
			System.out.println("testing: "+itr2.next().name+" "+itr2.next().rollno);     
			
		}

		for(userdefinedArrayList obj:list2)
		{
			System.out.println("testing: "+obj.name+" "+obj.rollno);   
		}
		
		*/
		/**
		 * Example 2: add all
		 */
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("first");
		l1.add("second");
		l1.add("third");
		
		
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("fourth");
		l2.add("fifth");
		
		l1.addAll(l2);
		
		Iterator<String> itr3=l1.iterator();
		while(itr3.hasNext())
		{
			System.out.println("testing: "+itr3.next());     
		}

		
		
	}
}