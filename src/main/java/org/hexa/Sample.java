package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample 
{
	public static void main(String[]args)
	{
		Base b=new Base();
		WebDriver driver=b.browserLaunch();
		b.loadUrl("http://www.facebook.com/");
		
		LoginPage l=new LoginPage();
		
		WebElement txtUserName=l.getTxtUserName();
		b.fill(txtUserName, "1234567");
		
		WebElement txtPassword=l.getTxtPassword();
		b.fill(txtPassword, "hello");
		
		WebElement btnLogin=l.getBtnLogin();
		b.btnClick(btnLogin);
		
	}


}
