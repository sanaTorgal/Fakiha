package Assignment_Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra_jackets {

	public static void main(String[] args)
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/child::a[@data-reactid=\"21\"]")).click();
		driver.findElement(By.xpath("//a[text()='Jackets & Sweatshirts']")).click();
		
		List<WebElement> jackets = driver.findElements(By.xpath("//ul[@class=\"results-base\"]/li"));
		
		int count=0;
		for (WebElement jac : jackets) 
		{
			count++;
			//System.out.println(jac.getText());
		}
		System.out.println(count);
	}

}
