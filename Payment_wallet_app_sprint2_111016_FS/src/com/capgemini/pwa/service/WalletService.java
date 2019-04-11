package com.capgemini.pwa.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capgemini.pwa.beans.Customer;



public class WalletService {
	private PreparedStatement ps = null;
	private Connection con; 

	@SuppressWarnings("unused")
	private DatabaseUtil databaseUtil;
	
	public boolean createAccount(int accId, String password, String name, String email, String phoneNumber, String address, String dob) {
		if(!validateCustomer(accId))
			return false;
		
		String insert = "INSERT INTO CUSTOMER (ACCID, PASSWORD, NAME, EMAIL, PHONE, ADDRESS, DOB) VALUES (?,?,?,?,?,?,?)";

		con = DatabaseUtil.getConnection();
		try {
			ps = con.prepareStatement(insert);
			ps.setInt(1, accId);
			ps.setString(2, password);
			ps.setString(3, name);
			ps.setString(4, email);
			ps.setString(5, phoneNumber);
			ps.setString(6, address);
			ps.setString(7, dob);
			
			int rows = ps.executeUpdate();
			
			if(rows > 0) {	
				String insertWallet = "INSERT INTO WALLET(ACCID, AMOUNT) VALUES (?,?)";
				ps = con.prepareStatement(insertWallet);
				ps.setInt(1, accId);
				ps.setDouble(2, 0);
				int rows2 = ps.executeUpdate();
				if(rows2>0)
					ps.close();
					return true;
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		DatabaseUtil.close();
		return false;
	}
	
	
	private boolean validateCustomer(int accId) {
		String findCustomer = "SELECT * FROM CUSTOMER WHERE ACCID = "+accId;
		return sqlExecuteSelect(findCustomer);
	}
	
	public boolean login(int accId, String password) {
		String login = "SELECT * FROM CUSTOMER WHERE ACCID = '"+accId+ "' AND PASSWORD = '"+password+"'";
		return sqlExecuteSelect(login);
	}
	
	private boolean sqlExecuteSelect(String sqlStatement) {
		new DatabaseUtil();
		con = DatabaseUtil.getConnection();
		try {
			ps = con.prepareStatement(sqlStatement);
			if(ps.execute()) {
				DatabaseUtil.close();
				return true;
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		DatabaseUtil.close();
		return false;
	}
	
	public double addFunds(int accId, double amount) {
		String addFunds = "UPDATE WALLET SET AMOUNT = AMOUNT + ? WHERE ACCID = ?";
		return funds(accId, amount, addFunds);
	}
	
	public double withdrawFunds(int accId, double amount) {
		if(enoughFunds(accId, amount)) {
			String withdrawFund = "UPDATE WALLET SET AMOUNT = AMOUNT - ? WHERE ACCID =?";
			return funds(accId, amount, withdrawFund);
		}
		return -1;
	}
	
	private double funds(int accId, double amount, String sqlStatement) {
		new DatabaseUtil();
		con = DatabaseUtil.getConnection();
		try {
			ps = con.prepareStatement(sqlStatement);
			ps.setDouble(1, amount);
			ps.setInt(2, accId);
			int rows = ps.executeUpdate();
			if(rows > 0) {
				DatabaseUtil.close();
				return getBalance(accId);
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		DatabaseUtil.close();
		return -1;
	}
	
	public double getBalance(int accId) {
		String getAmount = "SELECT AMOUNT FROM WALLET WHERE ACCID ="+accId;
		new DatabaseUtil();
		con = DatabaseUtil.getConnection();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(getAmount);
			while(rs.next()) {
				return rs.getDouble("AMOUNT");
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		DatabaseUtil.close();
		return -1;
	}
	
	public boolean enoughFunds(int accId, double amount) {
		if(getBalance(accId) >= amount)
			return true;
		return false;
	}
	
	public boolean tranferFunds(int accId, int recieverId, double amount) {
		if(!validateCustomer(recieverId))
			return false;
		if(withdrawFunds(accId, amount) == -1 || addFunds(recieverId, amount) == -1 )
			return false;
		return true;
	}
	
	public Customer getCustomer(int accId) {
		Customer cust = null;
		String findCustomer = "SELECT ACCID, PASSWORD, NAME, EMAIL, PHONE, ADDRESS, DOB FROM CUSTOMER WHERE ACCID="+accId;
		new DatabaseUtil();
		con = DatabaseUtil.getConnection();
		try {
			Statement st = con.createStatement();
			if(st.execute(findCustomer)) {
				ResultSet rs = st.getResultSet();
				if(rs.next()) {
					cust = new Customer();
					cust.setAccId(rs.getInt("ACCID"));
					cust.setPassword(rs.getString("PASSWORD"));
					cust.setName(rs.getString("NAME"));
					cust.setEmail(rs.getString("EMAIL"));
					cust.setPhoneNumber(rs.getString("PHONE"));
					cust.setAddress(rs.getString("ADDRESS"));
					cust.setDob(rs.getString("DOB"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DatabaseUtil.close();
		return cust;
	}
}
