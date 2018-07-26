package cpatterson.projects.solo.distribilltion.model;

public class Payer {
	public String name;
	public double balance;
	public double ratio;
	
	public Payer() {
		
	}

	public Payer(String name, double balance, double ratio) {
		super();
		this.name = name;
		this.balance = balance;
		this.ratio = ratio;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void subtractFromBalance(double ammount) {
		this.balance -= ammount;
	}
	
	public void addToBalance(double ammount) {
		this.balance += ammount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	@Override
	public String toString() {
		return "Payer [balance=" + balance + ", ratio=" + ratio + "]";
	}
}
