package configurations;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener {


public void onTestStart(ITestResult result) {
	Log.info("Test Case " +result.getTestName()+ " started successfully");
}

/**
 * Invoked each time a test succeeds.
 *
 * @param result <code>ITestResult</code> containing information about the run test
 * @see ITestResult#SUCCESS
 */
public void onTestSuccess(ITestResult result) {
	Log.info("Test Case " +result.getTestName()+ " executed successfully");
}

/**
 * Invoked each time a test fails.
 *
 * @param result <code>ITestResult</code> containing information about the run test
 * @see ITestResult#FAILURE
 */
public void onTestFailure(ITestResult result) {
	Log.error("Test Case " +result.getTestName()+ " failed");
}

/**
 * Invoked each time a test is skipped.
 *
 * @param result <code>ITestResult</code> containing information about the run test
 * @see ITestResult#SKIP
 */
public void onTestSkipped(ITestResult result) {
	Log.error("Test Case " +result.getTestName()+ "skipped");
}

/**
 * Invoked each time a method fails but has been annotated with
 * successPercentage and this failure still keeps it within the
 * success percentage requested.
 *
 * @param result <code>ITestResult</code> containing information about the run test
 * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
 */
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
}

/**
 * Invoked after the test class is instantiated and before
 * any configuration method is called.
 */
public void onStart(ITestContext context) {
}

/**
 * Invoked after all the tests have run and all their
 * Configuration methods have been called.
 */
public void onFinish(ITestContext context) {
	System.out.println("Failed cases "+context.getFailedTests());
}

}

