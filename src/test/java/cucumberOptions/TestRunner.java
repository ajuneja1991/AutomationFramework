package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/features",
		glue = "stepDefinitions",
		tags = "@demo",
		plugin = {"pretty","html:target/cucumber"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	
}
