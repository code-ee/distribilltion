package cpatterson.projects.solo.distribilltion.process;

import org.json.JSONObject;

public class BillProcessorTest {
	public void TestBillProcessor() {
		
		String testJSONString = "{\r\n" + 
				"	\"incomes\" : {\r\n" + 
				"		\"George\" : 3200,\r\n" + 
				"		\"Sally\" : 2600\r\n" + 
				"	},\r\n" + 
				"	\"bills\" : {\r\n" + 
				"		\"rent\" : 1000,\r\n" + 
				"		\"groceries\" : 300,\r\n" + 
				"		\"savings\" : 500,\r\n" + 
				"		\"phone\" : 100,\r\n" + 
				"		\"credit\" : 100,\r\n" + 
				"		\"furniture\" : 100,\r\n" + 
				"		\"insurance\" : 65,\r\n" + 
				"		\"studentLoans\" : 111\r\n" + 
				"	}\r\n" + 
				"}";
		
		JSONObject testJSONObj = new JSONObject(testJSONString);
		new BillProcessor(testJSONObj).run();
	}
}
