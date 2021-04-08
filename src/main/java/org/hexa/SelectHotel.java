package org.hexa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends AdactBase
{
	public SelectHotel()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selBtn;
	
	@FindBy(id="continue")
	private WebElement conBtn;

	public WebElement getSelBtn() {
		return selBtn;
	}

	public WebElement getConBtn() {
		return conBtn;
	}

}
