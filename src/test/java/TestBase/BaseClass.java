package TestBase;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	public FileReader fr;
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) throws IOException {
		prop=new Properties();
		fr = new FileReader("C:\\Users\\skyhi\\eclipse-workspace2025-09\\Framework1\\src\\test\\resources\\Config.properties");
		prop.load(fr);
		
		if (browser.equalsIgnoreCase("chrome")) {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new ChromeOptions());
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new FirefoxOptions());
        } 
        else if (browser.equalsIgnoreCase("edge")) {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new EdgeOptions());
        }
    
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
