package anjular.js;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AnjularSample {



	public  static final String URL ="file:///C:/Users/dys/Favorites/Downloads/Angular-master/Angular-master/src/app/app.component.html";
	@Test
	public void AngularApplication()throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver",".//chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			Thread.sleep(2000);
		  	driver.manage().window().maximize();
			driver.get(URL);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/ul/li[1]/h2/a")).click();
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@title='Creating the application shell']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@title='Part 1: Build a simple hero editor']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@title='Part 2: Build a master/detail page with a list of heroes.']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@title='Part 3: Refactor the master/detail view into separate components.']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Angular version");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Version')]")).click();
			Thread.sleep(3000);
			driver.quit();
			
	}
}
