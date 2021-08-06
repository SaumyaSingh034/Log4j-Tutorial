package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;

public class Demo {
	
	
	private static Logger log = LogManager.getLogger(Demo.class);
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		System.out.println(log);
		log.debug("Hi I am debug");
	//LOGGER.debug("Hi, I am from debug");
	//LOGGER.error("Hi I am from error");
		//LOGGER.info("Hi I am from Info");
		//LOGGER.fatal("Hi I am from Fatal");

	}

}
