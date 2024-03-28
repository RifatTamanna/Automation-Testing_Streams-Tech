package StreamsTech;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Stackholder extends BaseDriver{
	String url = "https://binsight.streamstech.com/auth/sign-in";
	@Test
	public void openUrl() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(10000);//1000ms = 1s
		
		//Login Page & User ID ,PAss
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("qa");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);		
		
		//Click on Admin 
		driver.findElement(By.xpath("//div[@class='module']")).click();
		driver.switchTo().window("https://binsight.streamstech.com/admin/Admin");
		Thread.sleep(2000);
		
		//Click on Sidebar
		driver.findElement(By.xpath("//mat-icon[@class='mat-icon notranslate fuse-vertical-navigation-item-arrow icon-size-4 ng-tns-c67-5 mat-icon-no-color']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Stakeholder Information']")).click();
		Thread.sleep(2000);

		//Plus Icon
		driver.findElement(By.xpath("//mat-icon[normalize-space()='add']")).click();
		driver.findElement(By.className("mat-form-field-flex ng-tns-c30-11")).sendKeys("Amin"); //Stackholder Name input
		Thread.sleep(2000);

		//Select Gender
		driver.findElement(By.className("//div[@id='mat-select-value-5']")).click();
		driver.findElement(By.className("//span[normalize-space()='Male']")).click();
		Thread.sleep(2000);

		//select country name
		driver.findElement(By.id("mat-select-value-7")).click();
		driver.findElement(By.className("//span[@class='mat-option-text'][normalize-space()='Rwanda']")).click();
		Thread.sleep(2000);
		
		// Geo Location
		driver.findElement(By.className("mat-select-trigger ng-tns-c124-32")).click();
		driver.findElement(By.xpath("//mat-icon[normalize-space()='expand_more']")).click();
		driver.findElement(By.xpath("(//mat-icon[normalize-space()='chevron_right'])[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/app-stl-tree[1]/div[1]/div[1]/mat-tree[1]/mat-tree-node[3]/li[1]/button[1]/span[2]/div[7]")).click();
		driver.findElement(By.cssSelector("mat-tree-node:nth-child(1) li:nth-child(1) button:nth-child(1) span:nth-child(1) mat-icon:nth-child(1)")).click();
		driver.findElement(By.cssSelector("//span[normalize-space()='Kibaga (Village)']")).click();
		Thread.sleep(2000);

		//Select StackholderType
		driver.findElement(By.cssSelector("#mat-select-value-9")).click();
		driver.findElement(By.className("//span[@class='mat-option-text'][normalize-space()='STH_kama']")).click();
		Thread.sleep(2000);

		//Select Profession
		driver.findElement(By.cssSelector("#mat-select-value-11")).click();
		driver.findElement(By.className("//span[@class='mat-option-text'][normalize-space()='Accountant']")).click();
		Thread.sleep(2000);

		//Select Person living with disability
		driver.findElement(By.cssSelector("mat-select-trigger[class='ng-tns-c124-22 ng-star-inserted']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='No']")).click();
		Thread.sleep(2000);

		//Input Mobile number
		driver.findElement(By.id("mat-input-1")).sendKeys("+88013448584");
		Thread.sleep(2000);

		//Click on Save button
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		
		//Click on Cancel button
		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		
		//Click on action(Yes) button
		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
		
		//Click on action(No) button
		driver.findElement(By.xpath("//span[normalize-space()='No']")).click();
		
		//Find Stackholder from the list
		driver.findElement(By.xpath("//mat-icon[normalize-space()='search']")).sendKeys("Amin");
		
		//For search by filter 
		driver.findElement(By.cssSelector("#mat-select-value-1")).sendKeys("STH_kama");
		
	}
}
