package org.hexa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration extends AdactBase
{
  public Registration()
  {
	  PageFactory.initElements(driver,this);
  }
  
  @FindBy(id="username")
  private WebElement usr;
  
  @FindBy(id="password")
  private WebElement pwd;
  
  @FindBy(id="re_password")
  private WebElement cpwd;
  
  @FindBy(id="full_name")
  private WebElement fName;
  
  @FindBy(id="email_add")
  private WebElement email;

public WebElement getUsr() {
	return usr;
}

public WebElement getPwd() {
	return pwd;
}

public WebElement getCpwd() {
	return cpwd;
}

public WebElement getfName() {
	return fName;
}

public WebElement getEmail() {
	return email;
}
  
  
}
