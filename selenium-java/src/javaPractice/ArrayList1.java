package javaPractice;
import java.util.*; 


public class ArrayList1 {


	public static void main(String args[]) {
		
		
		/**
		 * //Example 1: simple arraylist
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");

		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("fifth");
		list2.add("sixth");
		list2.add("third");
		list2.add("fourth");

		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println("testing: "+itr.next());     
		}

		/*for(String obj:list)
		{
			System.out.println("testing: "+obj);     
		}*/
		 System.out.println("collectively:");
		 System.out.println(list);    
		 
		 list.remove("first");
		 System.out.println("after removing first"+list); 
		 list.remove(2);
		 System.out.println("after removing second element"+list); 
		 list.removeAll(list2);
		 System.out.println("after removing all element"+list); 
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
		 * Example 2: add all using iterator 
		 */
		
		/*ArrayList<String> l1 = new ArrayList<String>();
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
		}*/

		
		/**
		 * Example 3: set using list iteartor 
		 */
		
		
		/*ArrayList<String> l3 = new ArrayList<String>();
		l3.add("first");
		l3.add("second");
		l3.add("third");
		
		ListIterator<String> litr=l3.listIterator();
		while(litr.hasNext())
		{
			Object element=litr.next();
			litr.set(element+"+");
		}
		
		ListIterator<String> litr2=l3.listIterator();
		while(litr2.hasNext())
		{
			Object element=litr2.next();
			System.out.println(element);
		}*/
		
		/**
		 * Example 4: set using iterator and previous 
		 */
		
		
		/*ArrayList<String> l4 = new ArrayList<String>();
		l4.add("first");
		l4.add("second");
		l4.add("third");
		
		ListIterator<String> litr3=l4.listIterator();
		while(litr3.hasNext())
		{
			Object element=litr3.next();
			System.out.println(element);
		}
		while(litr3.hasPrevious())
		{
			Object element=litr3.previous();
			System.out.println(element);
		}*/
	}
}