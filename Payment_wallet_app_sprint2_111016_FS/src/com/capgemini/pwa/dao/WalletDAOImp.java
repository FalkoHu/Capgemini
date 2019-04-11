package com.capgemini.pwa.dao;

import com.capgemini.pwa.beans.Customer;
import com.capgemini.pwa.service.WalletService;

public class WalletDAOImp implements WalletDAO {
	private WalletService walletService = new WalletService();
	
	@Override
	public boolean createAccount(int accId, String password, String name, String email, String phoneNumber, String address, String dob) {
		return walletService.createAccount(accId, password, name, email, phoneNumber, address, dob);
	}

	@Override
	public boolean login(int accId, String password) {
		return walletService.login(accId, password);
	}

	@Override
	public double addFunds(int accId, double amount) {
		return walletService.addFunds(accId, amount);
	}

	@Override
	public double getBalance(int accId) {
		return walletService.getBalance(accId);
	}

	@Override
	public Customer showAccountInfo(int accId) {
		return getCustomer(accId);
	}

	@Override
	public boolean transferFunds(int accId, int recieverId, double amount) {
		return walletService.tranferFunds(accId, recieverId, amount);
	}

	@Override
	public boolean enoughFunds(int accId, double amount) {
		return walletService.enoughFunds(accId, amount);
	}
	
	@Override
	public Customer getCustomer(int accId) {
		return walletService.getCustomer(accId);
	}

	@Override
	public double withdrawFunds(int accId, double amount) {
		return walletService.withdrawFunds(accId, amount);
	}
}