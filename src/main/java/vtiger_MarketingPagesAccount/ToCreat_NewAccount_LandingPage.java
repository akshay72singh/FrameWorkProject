package vtiger_MarketingPagesAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_GenericMethod.GenericMethods;

public class ToCreat_NewAccount_LandingPage {


	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement accountName;
	
	@FindBy(xpath = "//input[@name='website']")
	private WebElement webSiteName;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement mobileNumber;
	
	private GenericMethods gobj;
	public ToCreat_NewAccount_LandingPage (GenericMethods gobj) {
		this .gobj = gobj;
		PageFactory.initElements(gobj.getDriverValue(), this);
	}

	public ToValidateCreatedNewAccount clickOnSaveButton() {
		
		gobj.ToClickAnyButton(saveButton, "Save Button of created Account");
		
		ToValidateCreatedNewAccount validateAccount = new  ToValidateCreatedNewAccount(gobj);
		return validateAccount;
		
	}
        public void clickOnCanceleButton() {
		
		gobj.ToClickAnyButton(cancelButton, "Cancel Button of created Account ");
		
	
        }
        
        public  void   fillAllInputBoxes() {
        	
    		gobj.toSendValueInInputBox(accountName, "hello","Account Name box");
    		
    		gobj.toSendValueInInputBox(webSiteName, "Vtiger","WebSiteName box");
    		
    		gobj.toSendValueInInputBox(mobileNumber, "7860xxxx77","mobile Number Box");

 	
        }
}
