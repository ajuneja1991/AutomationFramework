package utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;
	// Driver Configuration method
	public WebDriver initilizeDriver() throws Exception {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\AmanJuneja\\SWWJ_demo\\AutomationFramework\\src\\main\\java\\resources\\config.properties");
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmanJuneja\\Documents\\Selenium Certified\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
		}else if(browserName.equalsIgnoreCase("ie")){
		
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("browser not supported");
		}
		
		
		// Time after which you should start testing
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
}
