package vtiger_MarketingPagesAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework_GenericMethod.GenericMethods;

public class ToValidateCreatedNewAccount {

	private GenericMethods gobj;
	public ToValidateCreatedNewAccount(GenericMethods gobj) {
		this.gobj = gobj;
	}
	
	@FindBy (xpath="//span[text()='7860xxxx77']")
	private WebElement elementName;
	
	public void toValidateNewCreatedAccount() {
		
		gobj.toValidatePageByTEXT(elementName, " Created Account Page ", "Phone Number Box", "7860xxxx77");
	
	}
}
