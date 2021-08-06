package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;

public class Demo1 {
	
	private static Logger LOGGER = LogManager.getLogger(Demo1.class);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LOGGER.debug("Hi, I am from debug");
		LOGGER.error("Hi I am from error");
		LOGGER.info("Hi I am from Info");
		LOGGER.fatal("Hi I am from Fatal");

	}

}
