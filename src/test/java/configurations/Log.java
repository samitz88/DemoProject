package configurations;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

public class Log {

static //Initialize log4j logs
	LoggerContext context = (LoggerContext) LogManager.getContext(false);
	

/*
 * public Log() { String pathString = System.getProperty("user.dir"); File file
 * = new File(pathString+"\\log4j2.xml");
 * context.setConfigLocation(file.toURI());
 * //System.setProperty("log4j.configurationFile",
 * "C:\\Users\\samit\\eclipse-workspace\\project\\log4j2.xml");
 * 
 * }
 */

	private static Logger log = LogManager.getLogger(Log.class.getName());
// This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite

	public static void startTestCase(String sTestCaseName) {

		log.info("**************************************" + sTestCaseName
				+ "*************************************************");

	}

	// This is to print log for the ending of the test case

	public static void endTestCase(String sTestCaseName) {

		log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");


	}

	// Need to create these methods, so that they can be called

	public static void info(String message) {

		log.info(message);

	}

	public static void warn(String message) {

		log.warn(message);

	}

	public static void error(String message) {

		log.error(message);

	}

	public static void fatal(String message) {

		log.fatal(message);

	}

	public static void debug(String message) {

		log.debug(message);

	}

}