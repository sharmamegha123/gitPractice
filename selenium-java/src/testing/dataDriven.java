package testing;

import java.util.Hashtable;


public class dataDriven {

	
	public static Sheet sheet;
	public static Workbook wb=null;
	
	public static Hashtable<String,Integer> onic=new Hashtable<String,Integer>();
	
	
	dataDriven(String ExcelPath)
	{
		
		try
		{
			wb=Workbook.
			sheet=wb.getSheet(ExcelPath);
			
		}
		
		catch(Exception e)
		{
			
		}
		
	}
	
	
}
