package com.capgemini.pwa.beans;

public class Wallet {
	
	private double amount;
	private static int walletId;
	
	public Wallet() {
		super();
		amount = 0.00;
		walletId++;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getWalletId() {
		return walletId;
	}
	@Override
	public String toString() {
		return "\namount: $" + amount + ", walletId: " + walletId;
	}	
}