package javaPractice;

import java.util.ArrayList;
import java.util.List;

public class lambdaExample  {

	
	
	public static void main(String args[])
	{
		
		/*FuncInterface f2=(name)->{System.out.println(name);};
		
		f2.display("megha");*/
		
		/*FuncInterface f2=(int a,int b)-> { return (a+b);};
		System.out.println(f2.add(100,200));  
		*/
		
		List<String> list=new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		list.forEach(
				(n)->System.out.println("value: "+n)
	);
	}
	
	
	
	
	
}
