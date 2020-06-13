package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(  
	    features = "src/test/java/cucumberOptions/login.feature",
	    glue="stepDefinitions")

@RunWith(Cucumber.class)
public class TestRunner extends AbstractTestNGCucumberTests{

}
