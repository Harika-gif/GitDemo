package alpha;

import org.apache.logging.log4j.*;

public class Demo {

	// create log object where logger is api
	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	log.debug("I am debugging");
	
	log.info("object is present");
	log.error("object is not present");
	log.fatal("this is fatal");
	
		
	}

}
