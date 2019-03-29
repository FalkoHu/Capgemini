package com.capgemini.pwa.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.pwa.beans.Customer;
import com.capgemini.pwa.beans.Wallet;

public class WalletDAOImp implements WalletDAO {
	private Map<Integer, Customer> customerMap = new HashMap<>();
	private Customer customer;
	
	@Override
	public boolean createAccount(int accId, String password, String name, String email, String phoneNumber, String address, String dob) {
		if(validateCustomer(customerMap, accId)) {
			customer = new Customer(accId, password, name, email, phoneNumber, address, dob, new Wallet());			
			customerMap.put(accId, customer);
			return true;
		}
		return false;
	}

	@Override
	public boolean validateCustomer(Map<Integer, Customer> map, int accId) {
			if(map.containsKey(accId)) 
				return false;
			return true;
	}

	@Override
	public boolean login(int accId, String password) {
		if(getCustomer(accId).getPassword().equals(password)) {
			return true;
		}
		return false;
	}

	@Override
	public double addFunds(int accId, double amount) {
		getCustomer(accId).getWallet().setAmount(getBalance(accId) + amount);
		return getBalance(accId);
	}

	@Override
	public double getBalance(int accId) {
		return getCustomer(accId).getWallet().getAmount();
	}

	@Override
	public Customer showAccountInfo(int accId) {
		return getCustomer(accId);
	}

	@Override
	public boolean transferFunds(int accId, int recieverId, double amount) {
			if(containsReciever(recieverId)) {
				addFunds(recieverId, amount);
				withdrawFunds(accId, amount);
				return true;
			}
		return false;
	}

	@Override
	public boolean enoughFunds(int accId, double amount) {
		if(getCustomer(accId).getWallet().getAmount() >= amount) {
			return true;
		}
		return false;
	}
	
	@Override
	public Customer getCustomer(int accId) {
		return customerMap.get(accId);		
	}
	
	@Override
	public boolean containsReciever(int recieverId) {
		if(!validateCustomer(customerMap, recieverId)) {
			return true;
		}
		return false;
	}

	@Override
	public double withdrawFunds(int accId, double amount) {
		getCustomer(accId).getWallet().setAmount(getBalance(accId) - amount);
		return getBalance(accId);
	}
}