package allCommonMethods;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import framework_GenericMethod.GenericMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {

	ExtentReports reports;
	ExtentTest extTest;
	public WebDriver driver;
	
	static GenericMethods obj = new GenericMethods();
	

		
	public static void login() {
		
			WebElement userName = obj.toSearchTheElementByLocaters("name", "user_name");
			obj.toSendValueInInputBox(userName,"admin","user name box");
			
			WebElement password = obj.toSearchTheElementByLocaters("name", "user_password");
			obj.toSendValueInInputBox(password, "admin", "password Box");
			
			WebElement login = obj.toSearchTheElementByLocaters("name", "Login");
			obj.ToClickAnyButton(login, "login Button");
			
	}
	
	public void logOut() {
		
		WebElement signOut = obj.toSearchTheElementByLocaters("xpath", "//a[text()='Sign Out']");
		obj.ToClickAnyButton(signOut, "sign Out");
	
	}
	
	public String dateFormate() {

		String date = "";
		try {

			DateFormat dateformate = new SimpleDateFormat("dd_MM_yyyy___hh_mm_ss");
			date = dateformate.format(new Date());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public ExtentReports toGenerateReport(String generatingFileName, String folderToSaveReport) {

		try {
			String date = dateFormate();

			ExtentSparkReporter exspark = new ExtentSparkReporter(
					"Automation_Report\\report" + date + ".html");
			reports = new ExtentReports();
			reports.attachReporter(exspark);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return reports;
	}

}
