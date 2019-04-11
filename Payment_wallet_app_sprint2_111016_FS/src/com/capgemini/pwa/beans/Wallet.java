package com.capgemini.pwa.beans;

public class Wallet {
	
	private double amount;

	public Wallet() {
		super();
		amount = 0.00;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "\namount: $" + amount;
	}	
}