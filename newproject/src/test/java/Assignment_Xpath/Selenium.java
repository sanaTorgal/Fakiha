package Assignment_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		Actions act=new Actions(driver);
		WebElement grid = driver.findElement(By.xpath("//p[text()='Selenium Server (Grid)']"));
		act.scrollToElement(grid).perform();
		driver.findElement(By.xpath("//p[@class=\"card-title fw-bold h6\" and text()='Python']/parent::div[@class=\"card-body px-0 text-center\"]/descendant::a[text()='API Docs']")).click();
		

	}

}
