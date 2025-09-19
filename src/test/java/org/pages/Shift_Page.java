package org.pages;

import org.baseclass.Baseclass;
import org.openqa.selenium.support.PageFactory;

public class Shift_Page extends Baseclass{
	
	public Shift_Page(){
		PageFactory.initElements(driver, this);
		
	}

}
