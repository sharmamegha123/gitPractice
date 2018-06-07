package javaPractice;

class Child extends Parent{  
	  void msg()throws Exception{System.out.println("child");}  
	  
	  public static void main(String args[]){  
	   Parent p=new Child();  
	   try{  
	   p.msg();  
	   }catch(Exception e){}  
	  }  
	}  