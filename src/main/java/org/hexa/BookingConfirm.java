package org.hexa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm extends AdactBase
{
	public BookingConfirm()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//input[@class='disable_text'])[15]")
	private WebElement ordNo;

	public WebElement getOrdNo() {
		return ordNo;
	}
	
}
