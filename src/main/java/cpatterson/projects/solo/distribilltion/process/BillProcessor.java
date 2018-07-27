package cpatterson.projects.solo.distribilltion.process;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONObject;

import cpatterson.projects.solo.distribilltion.model.Payer;

public class BillProcessor {
	private double totalBills;
	private double totalIncome;
	private List<Payer> people;

	public BillProcessor(JSONObject parameters) {
		super();
		this.totalBills = calculateTotal(parameters.getJSONObject("bills"));
		this.totalIncome = calculateTotal(parameters.getJSONObject("people"));
		this.people = getPayers(parameters.getJSONObject("people"));
	}
	
	public void run() {
		System.out.println("Before:");
		System.out.println(this.toString());
		for (Payer p : this.people) {
			System.out.println(p.toString());
		}
		
		for (Payer p : this.people) {
			p.setBalance(p.getBalance() - (this.totalBills * p.getRatio()));
		}
		
		System.out.println("After:");
		System.out.println(this.toString());
		for (Payer p : this.people) {
			System.out.println(p.toString());
		}
		
	}
	
	public double calculateTotal(JSONObject jsonObject) {
		double total = 0;
		Iterator<?> keys = jsonObject.keys();

		while (keys.hasNext()) {
		    String key = (String)keys.next();
		    total += jsonObject.getDouble(key);
		}
		return total;
	}
	
	public ArrayList<Payer> getPayers(JSONObject incomes) {
		ArrayList<Payer> payers = new ArrayList<Payer>();
		double income;
		Iterator<?> keys = incomes.keys();

		while (keys.hasNext()) {
		    String key = (String)keys.next();
		    income = incomes.getDouble(key);
		    payers.add(new Payer(key, income, (income/this.totalIncome)));
		}
		
		return payers;
	}

	@Override
	public String toString() {
		return "BillProcessor [totalBills=" + totalBills + ", totalIncome=" + totalIncome + "]";
	}

	
}
