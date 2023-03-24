package vtiger.Pages.MyHomePage.home;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_GenericMethod.GenericMethods;
import vtiger.Marketing.Leads.LandingPage.ToGoOnMarketingLeadsLandingPage;
import vtiger.Sales.Quotes_LandingPage.ToGoOn_SalesQuotes_LandingPage;
import vtiger_MarketingPagesAccount.ToGoOnMarketing_AccountLandingPage;

public class HomePage {

	private GenericMethods gobj; 

	@FindBy(linkText = "Marketing")
	private WebElement marketing;

	@FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Accounts']")
	private WebElement account;

	@FindBy(xpath = "//div[@id='Marketing_sub']//a[text()='Leads']")
	private WebElement leads;

	@FindBy(linkText = "Sales")
	private WebElement salesLink;

	@FindBy(linkText = "Quotes")
	private WebElement quotesLink;

	public HomePage(GenericMethods gobj) {
		
		this .gobj=gobj;
		PageFactory.initElements(gobj.getDriverValue(), this);

	}
	public ToGoOnMarketing_AccountLandingPage goToMarketingAccount() {

		gobj.toMouseOver(marketing, "Marketing Link");


		gobj.ToClickAnyButton(account, "Account Link");

		ToGoOnMarketing_AccountLandingPage accountLandingPage = new ToGoOnMarketing_AccountLandingPage(gobj);
				
		return accountLandingPage;
	}

	public ToGoOnMarketingLeadsLandingPage goToMarketingLeads() {

		gobj.toMouseOver(marketing, "Marketing Link");

		    gobj.ToClickAnyButton(leads, "Leads Link");

		ToGoOnMarketingLeadsLandingPage leadsLandingPage = new  ToGoOnMarketingLeadsLandingPage();
				
		return leadsLandingPage;
	}
  
	public ToGoOn_SalesQuotes_LandingPage toGoSales_QuotesPage() {

		gobj.toMouseOver(salesLink, "Sales Link");

		gobj.ToClickAnyButton(quotesLink, "Quotes Link");

		ToGoOn_SalesQuotes_LandingPage selesQutos = PageFactory.initElements(gobj.getDriverValue(),
				ToGoOn_SalesQuotes_LandingPage.class);
		return selesQutos;
	}
}
