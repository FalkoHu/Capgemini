package com.capgemini.pwa.dao;

import java.util.Map;

import com.capgemini.pwa.beans.Customer;

public interface WalletDAO {
	
	boolean createAccount(int accId, String password, String name, String email, String phoneNumber, String address, String dob);
	boolean validateCustomer(Map<Integer, Customer> map, int accId);
	boolean login(int accId, String password);
	
	double addFunds(int accId, double amount);
	double withdrawFunds(int accId, double amount);
	double getBalance(int accId);
	Customer showAccountInfo(int accId);
	
	boolean transferFunds(int accId, int recieverId, double amount);
	boolean enoughFunds(int accId, double amount);
	
	Customer getCustomer(int accId);
	boolean containsReciever(int recieverId);
}

