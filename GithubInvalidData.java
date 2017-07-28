package org.Selenium.ClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithubInvalidData {

	public static void main(String[] args) {
		//it will open empty browser
		  WebDriver driver = new FirefoxDriver();
		//navigate the github web site
		  driver.get("https://github.com/");
	      driver.manage().window().maximize();
		//click sign in link 
		  driver.findElement(By.linkText("Sign in")).click();
		//providing login information 
		  driver.findElement(By.id("login_field")).sendKeys("glokesh99@outlook.com");
		  driver.findElement(By.id("password")).sendKeys("Gthulas921");
		  driver.findElement(By.name("commit")).click();
		//getting current URL
		  String currentUrl = driver.getCurrentUrl();
				
		  System.out.println(currentUrl);
				
		  String expUrl = "https://github.com/";
		//validating current URL and expUrl 
		//we can use asserts also
		  if(currentUrl.equalsIgnoreCase(expUrl)){
			 System.out.println("Login is successfull");
			}
		  else{
			System.out.println("Login is not successfull");
			}
	}

}
