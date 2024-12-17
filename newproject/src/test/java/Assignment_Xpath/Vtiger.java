package Assignment_Xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
	/*	driver.findElement(By.xpath("//td[text()=\"CON2 \"]/parent::tr[@class=\"lvtColData\"]/descendant::input[@onclick=\"check_object(this)\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//td[text()=\"CON2 \"]/parent::tr[@class=\"lvtColData\"]/descendant::a[text()='del']")).click();*/
	/*	driver.findElement(By.xpath("//input[@name=\"selected_id\"]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'CON')]/../td/a[contains(.,'del')]")).click();
		Alert alt=driver.switchTo().alert();
			alt.accept();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");*/
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@onclick=\"check_object(this)\"]"));
			int checksize=list.size();
			System.out.println(checksize);
			System.out.println("no of checksize btns:"+checksize);
			List<WebElement> delbtn = driver.findElements(By.xpath("//a[text()='del']"));
			int delsize=delbtn.size();
			System.out.println("no of del btns:"+delsize);
			try
			{
				for(int i=1;i<checksize-1;i++)
				{
					for(int j=1;j<delsize-1;j++)
					{
						list.get(i).click();
						delbtn.get(i).click();
						Alert alt=driver.switchTo().alert();
						alt.accept();
					}
				}
			}
			catch (Exception e) 
			{
				System.out.println("Exception handled");
			}
	 }	
				
}
		
		
		
		
		


