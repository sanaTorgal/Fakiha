package Assignment_Xpath;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws Throwable 
	{
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//a[@class=\"desktop-main\"  and text()='Home & Living']"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		//List<WebElement> eles = driver.findElements(By.xpath("//ul[@class=\"desktop-navBlock\" and @data-reactid=\"90\"]/li"));
		List<WebElement> eles = driver.findElements(By.xpath("//ul[@class='desktop-navBlock' and @data-reactid='575']//li/a"));
		Thread.sleep(2000);
		for (WebElement sugg : eles)
		{
			
			//act.moveToElement(sugg).perform();
			System.out.println(sugg.getText());
	
		} 
		
		
	/*	//mens jackets
		WebElement menlink = driver.findElement(By.xpath("//a[@class=\"desktop-main\" and text()='Men']"));
		Actions act=new Actions(driver);
		act.moveToElement(menlink).perform();
		
		
		driver.findElement(By.xpath("//a[text()='Jackets' and @data-reactid=\"41\"]")).click();
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
		List<WebElement> eles = driver.findElements(By.xpath("//ul[@class=\"results-base\"]//li"));
		for (WebElement ele : eles)
		{
			System.out.println(ele.getText());
			
		} */
	
	}

}
