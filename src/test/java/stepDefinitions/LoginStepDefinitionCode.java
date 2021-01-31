package stepDefinitions;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HomepageObjects;
import utilities.Base;

public class LoginStepDefinitionCode  extends Base{

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@Given("^User is on medic bleep Application$")
    public void user_is_on_medic_bleep_application() throws Throwable {
        
		driver = initilizeDriver();
		log.info("Driver is initilized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to HomePage");
		HomepageObjects hpo = new HomepageObjects(driver);
		String headerValue = hpo.getHeader().getText();
		Assert.assertEquals(headerValue, headerValue);
		log.info("Successfully validated header text");
		driver.close();
    }

    @Then("^title for page is \"([^\"]*)\"$")
    public void title_for_page_is_something(String strArg1) throws Throwable {
        
    }
	
}
