package vTiger_Test_Script;

import org.openqa.selenium.support.PageFactory;


import framework_GenericMethod.GenericMethods;
import vtiger.Pages.MyHomePage.home.HomePage;
import vtiger.Marketing.Leads.LandingPage.ToCreatNewLeadsLandingPage;
import vtiger.Marketing.Leads.LandingPage.ToGoOnMarketingLeadsLandingPage;
import vtiger.Marketing.Leads.LandingPage.ValidateCreatedLeadsPage;
import vtiger.Pages.MyHomePage.home.HomePage;
import vtiger_MarketingPagesAccount.ToCreat_NewAccount_LandingPage;
import vtiger_MarketingPagesAccount.ToGoOnMarketing_AccountLandingPage;
import vtiger_MarketingPagesAccount.ToValidateCreatedNewAccount;
import vtiger_Page_Login.LoginPage;

public class TestCase_1st {

	private GenericMethods gobj;
	
	public TestCase_1st(GenericMethods gobj) {
		
		this.gobj = gobj;
	}
	
	public  void reportTestIDBrowserURL() {

		gobj.toGenerateReport();

		gobj.createTest("Tc001");

		gobj.launchBeowser("chrome");

		gobj.hitUrl("http://localhost:8888/");

	}

	public static void goAndVlidateMarketingAccounts() {

		GenericMethods gobj = new GenericMethods();

		TestCase_1st testCase = new TestCase_1st(gobj);
		testCase.reportTestIDBrowserURL();

		 HomePage homePage = new LoginPage(gobj).vailidLoginPage();

     ToGoOnMarketing_AccountLandingPage mrktAcountLandingPage =   homePage.goToMarketingAccount();

		ToCreat_NewAccount_LandingPage creatNewAccount = mrktAcountLandingPage.toClickCreatAccountButton();

		creatNewAccount.fillAllInputBoxes();

		ToValidateCreatedNewAccount validateCreatedAcc = creatNewAccount.clickOnSaveButton();

		validateCreatedAcc.toValidateNewCreatedAccount();

	}

	public void goAndValidateMarketingLeads() {

		GenericMethods gobj = new GenericMethods();

		reportTestIDBrowserURL();
		
		LoginPage login = PageFactory.initElements(gobj.getDriverValue(), LoginPage.class);
		HomePage homePage = login.vailidLoginPage();

		ToGoOnMarketingLeadsLandingPage leadsLandingPage = homePage.goToMarketingLeads();

//     leadsLandingPage.toCheck_CheckBox();
//		leadsLandingPage..toCheckColour();
//		leadsLandingPage.toClickOnDeletButton();
//		leadsLandingPage.alartPop_Up();

		ToCreatNewLeadsLandingPage ceratNewLeads = leadsLandingPage.clickOnCreatLeadsButton();
		ceratNewLeads.toFillAllInputBoxes();
//		ValidateCreatedLeadsPage validateLeads = ceratNewLeads.toClickOnSaveButton();

//		validateLeads.validateLeads();

	}

}
