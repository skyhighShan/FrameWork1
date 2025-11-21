package TestBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	public FileReader fr;
	@BeforeClass
	public void setup() throws IOException {
		prop=new Properties();
		fr = new FileReader("C:\\Users\\skyhi\\eclipse-workspace2025-09\\Framework1\\src\\test\\resources\\Config.properties");
		prop.load(fr);
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
