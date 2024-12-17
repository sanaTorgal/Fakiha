package Assignment_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("iphone15",Keys.ENTER);
		//String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/ancestor::div[@class=\"yKfJKb row\"]/descendant::div[@class=\"Nx9bqj _4b5DiR\"]")).getText();
		//System.out.println(price);
		String price = driver.findElement(By.xpath("//div[@class=\"yKfJKb row\" and contains(., 'Apple iPhone 15 (Blue, 128 GB)')]/descendant::div[@class=\"Nx9bqj _4b5DiR\"]")).getText();
		
		System.out.println(price);
		System.out.println("Hello");
		
	}

}
