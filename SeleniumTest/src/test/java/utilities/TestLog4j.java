package utilities;

import org.apache.logging.log4j.LogManager;

//import org.apache.logging.log4j.core.appender.;
import org.apache.logging.log4j.core.appender.HttpAppender;
import org.apache.logging.log4j.Logger;
public class TestLog4j {
	/* @author : Sujit Sugathan 
	 * 
	 * Logs will be generated in 3 ways: 
	 * 
	 * 1. Console Logs 
	 * 2. File Logs   (.log extension files)
	 * 3. Mail logs (sends emails with the error logs)
	 */
	static Logger log = LogManager.getLogger(TestLog4j.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World !!!");
		log.debug("This is a Debug Log");
		log.info("This is an information Log");
		log.error("This is an error log");
		log.warn("This is a warning message");
		log.fatal("This is a fatal message");
		
		System.out.println("Completed....");
	}

}
