package vtiger.Marketing.Leads.LandingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_GenericMethod.GenericMethods;
import vtiger_MarketingPagesAccount.ToCreat_NewAccount_LandingPage;
import vtiger_Page_Login.LoginPage;

public class ToGoOnMarketingLeadsLandingPage {

	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement creatLeadsButton;

	@FindBy(xpath = "//input[@id='40']")
	private WebElement checkBox;

	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deletButton;

	@FindBy(xpath = "(//input[@value='Delete'])[2]")
	private WebElement deletButtonColor;

	private GenericMethods gobj;

	public ToGoOnMarketingLeadsLandingPage(GenericMethods gobj) {
		this.gobj = gobj;
		PageFactory.initElements(gobj.getDriverValue(), this);
	}

	public ToCreatNewLeadsLandingPage clickOnCreatLeadsButton() {

		gobj.ToClickAnyButton(creatLeadsButton, "Creat Leads Button");

		ToCreatNewLeadsLandingPage creatleads = new ToCreatNewLeadsLandingPage(gobj);
		return creatleads;
	}

	public void toCheck_CheckBox() {

		gobj.toCheck_CheckBoxStatus(checkBox, "LEA15");

	}

	public void toClickOnDeletButton() {

		gobj.toCheck_CheckBoxStatus(deletButton, "Delet");

	}

	public void alartPop_Up() {

		gobj.toAcceptPop_Up();
	}

	public void toCheckColour() {

		gobj.toGetCssValueOrElementColour(deletButtonColor, "Delet Button", "color");
	}
}
