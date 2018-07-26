package cpatterson.projects.solo.distribilltion.process;

import java.util.HashMap;

import org.json.JSONObject;

public class BillProcessorTest {
	public void TestBillProcessor() {
		String testJSONString = "{\r\n" + 
				"	\"incomes\" : {\r\n" + 
				"		\"Cody\" : 3200,\r\n" + 
				"		\"Ally\" : 1300\r\n" + 
				"	},\r\n" + 
				"	\"bills\" : {\r\n" + 
				"		\"rent\" : 1000,\r\n" + 
				"		\"groceries\" : 300,\r\n" + 
				"		\"savings\" : 200,\r\n" + 
				"		\"phone\" : 100,\r\n" + 
				"		\"credit\" : 100,\r\n" + 
				"		\"furniture\" : 100,\r\n" + 
				"		\"insurance\" : 65,\r\n" + 
				"		\"studentLoans\" : 111\r\n" + 
				"	}\r\n" + 
				"}";
		HashMap<String, Double> incomes = new HashMap<String, Double>();
		HashMap<String, Double> bills = new HashMap<String, Double>();
		JSONObject incomesJSON = new JSONObject();
		JSONObject billsJSON = new JSONObject();
		JSONObject testJSONObject = new JSONObject();
		
		incomes.put("Cody", new Double(3200));
		incomes.put("Ally", new Double(1300));
		
		bills.put("rent", new Double(1000));
		bills.put("groceries", new Double(300));
		bills.put("savings", new Double(200));
		bills.put("phone", new Double(100));
		bills.put("credit", new Double(100));
		bills.put("furniture", new Double(100));
		bills.put("insurance", new Double(65));
		bills.put("studentLoans", new Double(111));
		
	}
}
