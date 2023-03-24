package vTiger_Test_Script;

import framework_GenericMethod.GenericMethods;

public class RunnerClass {

	private static GenericMethods gobj;
	
	public static void main(String[] args) {

		TestCase_1st testCase = new TestCase_1st(gobj);
		testCase.goAndVlidateMarketingAccounts();
//		testCase.goAndValidateMarketingLeads();

	}
}
           