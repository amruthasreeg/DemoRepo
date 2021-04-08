package org.hexa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends AdactBase
{
  public BookHotel()
  {
	  PageFactory.initElements(driver,this);
  }
  
  @FindBy(id="first_name")
  private WebElement firstName;
  
  @FindBy(id="last_name")
  private WebElement lastName;
  
  @FindBy(id="address")
  private WebElement address;
  
  @FindBy(id="cc_num")
  private WebElement credit;
  
  @FindBy(id="cc_type")
  private WebElement cType;
  
  @FindBy(id="cc_exp_month")
  private WebElement expMonth;
  
  @FindBy(id="cc_exp_year")
  private WebElement expYear;
  
  @FindBy(id="cc_cvv")
  private WebElement cvv;
  
  @FindBy(id="book_now")
  private WebElement bookNow;

public WebElement getFirstName() {
	return firstName;
}

public WebElement getLastName() {
	return lastName;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCredit() {
	return credit;
}

public WebElement getcType() {
	return cType;
}

public WebElement getExpMonth() {
	return expMonth;
}

public WebElement getExpYear() {
	return expYear;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getBookNow() {
	return bookNow;
}
}
