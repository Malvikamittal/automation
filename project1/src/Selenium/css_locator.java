package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//hp//Downloads//chromedriver-win64//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fproductemailafriend%2F41");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#gender-male")).click();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
	}

}
