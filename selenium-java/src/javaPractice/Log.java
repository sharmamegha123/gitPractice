package javaPractice;

import org.apache.log4j.Logger;

public class Log {

	
	private static Logger log=Logger.getLogger(Log.class.getName());
	
	public static void debug(String msg)
	{
		log.debug(msg);
	}
	
	public static void info(String msg)
	{
		log.info(msg);
	}
	public static void error(String msg)
	{
		log.error(msg);
	}
}
