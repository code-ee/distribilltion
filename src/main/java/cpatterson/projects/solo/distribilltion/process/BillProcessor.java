package cpatterson.projects.solo.distribilltion.process;

import java.util.Iterator;

import org.json.JSONObject;

public class BillProcessor {
	private JSONObject incomes;
	private JSONObject bills;
	
	private double totalBills;
	private double totalIncome;
	private double ratio;
	
	public BillProcessor(JSONObject parameters) {
		super();
		this.incomes = (JSONObject) parameters.get("incomes");
		this.bills = (JSONObject) parameters.get("bills");
		totalBills = 0;
		totalIncome = 0;
		ratio = 0;
	}
	
	public void run() {
		System.out.println("This worked so far!");
	}
	
	public double addAllBills(JSONObject bills) {
		Iterator<?> keys = bills.keys();

		while( keys.hasNext() ) {
		    String key = (String)keys.next();
		    if (bills.get(key) instanceof JSONObject) {

		    }
		}
		return 0;
	}
}
