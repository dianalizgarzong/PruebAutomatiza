package PruebaCarroCompras;

import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;

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
	 
	 public void Prueba2() {
		 webElement searchbox = driver.findElement(by.name("q"));
				 searchbox.clear();
				 searchbox.sendkeys("Cart");
				 searchbox.submit();
				 
				 driver.manage().timeouts().implicitlyWait(10,java.util.concurrent.TimeUnit.SECONDS)
	 assertEquals("http://automationpractice.com/index.php",driver.getTitle());
	 
	 }
	 
	 @AFTER
	 public void tearDown() {
		 driver.quit();
	 }
}