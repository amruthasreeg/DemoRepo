package org.hexa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public static WebDriver driver;
	
	public WebDriver browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AmmuAnu\\eclipse-workspace\\SeleniumTask\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	 
	public void loadUrl(String url)
	{
		driver.get(url);
    }
	
	public void fill(WebElement e,String data)
	{
		e.sendKeys(data);
	}
	
	public void btnClick(WebElement ele)
	{
		ele.click();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	public String pageUrl()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	
	public String pageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	

}
