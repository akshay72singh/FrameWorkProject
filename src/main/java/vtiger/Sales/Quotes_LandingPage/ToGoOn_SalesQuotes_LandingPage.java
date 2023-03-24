package vtiger.Sales.Quotes_LandingPage;

import org.openqa.selenium.WebElement;

import framework_GenericMethod.GenericMethods;

public class ToGoOn_SalesQuotes_LandingPage {
	
	private GenericMethods gobj;
	
	public ToGoOn_SalesQuotes_LandingPage( GenericMethods gobj) {
		
		this.gobj = gobj;
		
	}

	public void clickOnCreatQuotesButton() {
	
		WebElement creatQuotes =gobj.toSearchTheElementByLocaters("xpath", "//img[@title='Create Quote...']");
		 gobj.ToClickAnyButton(creatQuotes, "Creat Quotes Button");

	}
}
