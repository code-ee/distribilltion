package cpatterson.projects.solo.distribilltion.model;

public class Bill {
	private String name;
	private double ammount;
	
	public Bill(String name, double ammount) {
		super();
		this.name = name;
		this.ammount = ammount;
	}
	
	public Bill() {
		super();
		this.name = "n/a";
		this.ammount = -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	@Override
	public String toString() {
		return "Bill [name=" + name + ", ammount=" + ammount + "]";
	}
}
