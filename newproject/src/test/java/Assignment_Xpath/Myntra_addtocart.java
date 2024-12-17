package Assignment_Xpath;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Myntra_addtocart 
{
	public static void main(String[] args) throws Throwable 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/child::a[@data-reactid=\"21\"]")).click();
		driver.findElement(By.xpath("//a[text()='Jackets & Sweatshirts']")).click();
		//Recommended
		 driver.findElement(By.xpath("//div[@class=\"sort-sortBy\"]")).click();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[.='Customer Rating']")).click();
		 
		 
		 driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]")).sendKeys("Mango man shirt",Keys.ENTER);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//h4[@class=\"product-product\"])[6]")).click();
		 
		 Set<String> allids = driver.getWindowHandles();
		 for (String id : allids)
		 {
			 driver.switchTo().window(id);
			 String title=driver.getTitle();
			
			 System.out.println(title);
			 if(title.contains("Buy MANGO MAN"))
			 {
				 break;
			 }
			
		}
		 Thread.sleep(1000);
	
	//	driver.findElement(By.xpath("//p[@class=\"size-buttons-unified-size\" and contains(.,'40')]")).click();
		//driver.findElement(By.xpath("//span[@class=\"myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center\"]")).click();
		
		 
	}
	

}
