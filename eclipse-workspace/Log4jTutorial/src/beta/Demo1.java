package beta;

import org.apache.logging.log4j.*;

public class Demo1 {

	// create log object where logger is api
	private static Logger log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	log.debug("I have clicked on button");
	
	log.info("Button is displayed");
	log.error("Button is not displayed");
	log.fatal("button is missing");
	
		
	}

}
