package com.mindtree.Assessment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assessment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Hovers")).click();
		
		WebElement ele = driver.findElement(By.xpath("//img[@src='/img/avatar-blank.jpg']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();
		
		String name = driver.findElement(By.xpath("//div[@class='figcaption']//h5")).getText();
		System.out.println(name);
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Checkboxes")).click();
		
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id='checkboxes']//input[2]"));
		checkbox1.click();
		
		Thread.sleep(2000);
		
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id='checkboxes']//input[1]"));
		checkbox2.click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Inputs")).click();
		
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234");
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Dropdown")).click();
		
		driver.findElement(By.xpath("//*[@id='dropdown']/option[3]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("File Upload")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Key Presses")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Context Menu")).click();
		
		driver.navigate().back();
		
		
		
		
		
		
		
	}

}
