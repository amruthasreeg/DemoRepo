package org.hexa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdactSample 
{
	public static void main(String[]args)
	{
		AdactBase b=new AdactBase();
		WebDriver driver=b.browserLaunch();
		b.loadUrl("https://adactinhotelapp.com/");
		
		LoginPage l=new LoginPage();
		
		WebElement txtUserName=l.getTxtUserName();
		b.fill(txtUserName, "Amruthasree");
		
		WebElement txtPassword=l.getTxtPassword();
		b.fill(txtPassword, "Atchu134@");
		
		WebElement btnLogin=l.getBtnLogin();
		b.btnClick(btnLogin);
			
		SearchHotel sh=new SearchHotel();
		
		WebElement loc=sh.getLoc();
		b.dropDown(loc,2);
		
		WebElement hotels=sh.getHotels();
		b.dropDown(hotels, 3);
		
		WebElement roomType=sh.getRoomType();
		b.dropDown(roomType, 2);
		
		WebElement roomNo=sh.getRoomNo();
		b.dropDown(roomNo, 3);
		
		WebElement checkIn=sh.getCheckIn();
		b.fill(checkIn,"17/03/2021");
		
		WebElement checkOut=sh.getCheckOut();
		b.fill(checkOut, "18/03/2021");
		
		WebElement adult=sh.getAdult();
		b.dropDown(adult, 2);
		
		WebElement child=sh.getChild();
		b.dropDown(child, 1);
		
		WebElement btnSubmit=sh.getBtnSubmit();
		b.btnClick(btnSubmit);
		
		SelectHotel selh=new SelectHotel();
		
		WebElement selBtn=selh.getSelBtn();
		b.btnClick(selBtn);
		
		WebElement conBtn=selh.getConBtn();
		b.btnClick(conBtn);
		
		BookHotel bh=new BookHotel();
		
		WebElement firstName=bh.getFirstName();
		b.fill(firstName, "Amruthasree");
		
		WebElement lastName=bh.getLastName();
		b.fill(lastName, "G");
		
		WebElement address=bh.getAddress();
		b.fill(address, "Thazhampoo st,Avadi");
		
		WebElement credit=bh.getCredit();
		b.fill(credit, "1234567890123456");
		
		WebElement cType=bh.getcType();
		b.dropDown(cType, 2);
		
		WebElement expMonth=bh.getExpMonth();
		b.dropDown(expMonth, 3);
		
		WebElement expYear=bh.getExpYear();
		b.dropDown(expYear, 4);
		
		WebElement cvv=bh.getCvv();
		b.fill(cvv, "123");
		
		WebElement bookNow=bh.getBookNow();
		b.btnClick(bookNow);
		
		BookingConfirm bc=new BookingConfirm();
		
		WebElement ordNo=bc.getOrdNo();
		String text=ordNo.getText();
		System.out.println(text);
		//b.printText(ordNo);
		
		
	}

}
