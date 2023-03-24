package vtiger.Marketing.Leads.LandingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_GenericMethod.GenericMethods;

public class ToCreatNewLeadsLandingPage {

	@FindBy(xpath = "//select[@name=\\\"salutationtype\\\"]")
	private WebElement prof;

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@name='company']")
	private WebElement companyName;

	@FindBy(xpath = "//input[@id='mobile']")
	private WebElement mobileNum;

	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement saveButton;

	@FindBy(xpath = "//input[@class='crmbutton small cancel']")
	private WebElement cancelButton;

private   GenericMethods gobj; 
	public ToCreatNewLeadsLandingPage(GenericMethods gobj) {
		this .gobj=gobj;
		PageFactory.initElements(gobj.getDriverValue(), this);
	}

	public void toFillAllInputBoxes() {

		gobj.ToHandleDropDownByIndexOf(prof, 5, "Profecer dropdown");

		gobj.toSendValueInInputBox(firstName, "akshay", "First Name ");

		gobj.toSendValueInInputBox(lastName, "Yadav", "Last Name ");

		gobj.toSendValueInInputBox(companyName, "TATA", "Company Name ");

		gobj.toSendValueInInputBox(mobileNum, "7860xxxx77", "Mobile Number ");

	}

	public ValidateCreatedLeadsPage toClickOnSaveButton() {

		gobj.ToClickAnyButton(saveButton, "Save Button ");

		ValidateCreatedLeadsPage validateLeads = new ValidateCreatedLeadsPage(gobj);
		return validateLeads;
	}

	public void toClickOnCancelButton() {

		gobj.ToClickAnyButton(cancelButton, "Cancel Button");

	}

}
