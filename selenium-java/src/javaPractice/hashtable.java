package javaPractice;

import java.util.Hashtable;
import java.util.Map.Entry;

public class hashtable extends Generics{
	
	static Hashtable<String,String> h=new Hashtable<String,String>();
	
	public static void main(String args[])
	{
		
		h.put("me","megha");
		h.put("me1","megha1");
		
		h.put("me2","megha2");
	
		String value="megha2";
		
		for(Entry<String, String> m:h.entrySet()){
			
			System.out.println("Hash is: "+m.getValue()+" "+m.getKey());
			if(m.getValue().contains(value))
			{
				System.out.println("pass------");
			}
		}
		
		
		
		
	}
	

	
	
	
	
	
	
}
