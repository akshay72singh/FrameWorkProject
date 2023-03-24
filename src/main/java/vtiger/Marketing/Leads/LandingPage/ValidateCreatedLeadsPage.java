package vtiger.Marketing.Leads.LandingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_GenericMethod.GenericMethods;

public class ValidateCreatedLeadsPage {

	@FindBy(xpath = "//span[text()='7860xxxx77']")
	private WebElement mobileNum;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement sign_Out;

	private GenericMethods gobj;

	public ValidateCreatedLeadsPage(GenericMethods gobj) {
		this.gobj = gobj;
		PageFactory.initElements(gobj.getDriverValue(), this);
	}

	public void validateLeads() {

		gobj.toValidatePageByTEXT(mobileNum, "Validate Created Leads Page", "Mobile Number", "7860xxxx77");

	}

	public void sign_Out() {

		gobj.ToClickAnyButton(sign_Out, "Sign-Out Button");
	}
}
