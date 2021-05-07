package Prueba3;

import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;


public class IngresarPagina{
	
	private WebDriver driver;
	 public void setup() {
		 
		 driver =new chromedriver
				 java.lang.System.setProperty("webdriver.chrome","./src/prueba3" )
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://automationpractice.com/index.php");
				 
	 }
	 
	 @preuba3DianaGarzon
	 
	 public void Prueba3() {
		 webElement searchbox = driver.findElement(by.name("q"));
				 searchbox.clear();
				 searchbox.sendkeys("Women");
				 searchbox.submit();
				 
				 driver.manage().timeouts().implicitlyWait(10,java.util.concurrent.TimeUnit.SECONDS)
	 assertEquals("http://automationpractice.com/index.php",driver.getTitle());
	 
	 }
	 
	 @AFTER
	 public void tearDown() {
		 driver.quit();
	 }
}
