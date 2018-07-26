package cpatterson.projects.solo.distribilltion.model;

public class Income {
	private String owner;
	private double ammount;
	
	public Income(String owner, double ammount) {
		super();
		this.owner = owner;
		this.ammount = ammount;
	}
	
	public Income() {
		super();
		this.owner = "n/a";
		this.ammount = -1;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public double getAmmount() {
		return ammount;
	}
	
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	
	@Override
	public String toString() {
		return "Income [owner=" + owner + ", ammount=" + ammount + "]";
	}
}
