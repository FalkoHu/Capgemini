package com.capgemini.pwa.main;
import java.util.Scanner;

import com.capgemini.pwa.dao.WalletDAOImp;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter(System.lineSeparator());
		boolean showMainMenu = true;
		boolean subMenu = false;
		boolean custIdBool = false;
		WalletDAOImp walletDao = new WalletDAOImp();
		
		
		while(showMainMenu) {
			System.out.println("Please select one of the options \n"+
								"1. Create Customer\n"+
								 "2. Login\n"+
								"3. Exit");
			switch(scan.nextInt()) {
				case 1:
					custIdBool = true;
					int accId = 0;
					while(custIdBool) {
						System.out.println("Enter a unique customer ID number");
						int accountId = scan.nextInt();
						if(walletDao.getCustomer(accountId) == null) {
							accId = accountId;
							custIdBool = false;
							break;
						}else {
							System.out.println("\nAccount ID does already exists\n");
						}
					} 
					System.out.println("Enter your password");
					String password = scan.next();
					
					System.out.println("Enter your name");
					String name = scan.next();
					
					System.out.println("Enter your email address");
					String email = scan.next();
					
					System.out.println("Enter your phone number");
					String phoneNumber = scan.next();
					
					System.out.println("Enter your address");
					String address = scan.next();
					
					System.out.println("Enter your date of birth");
					String dob = scan.next();
					
					if(walletDao.createAccount(accId, password, name, email, phoneNumber, address, dob)) {
						System.out.println("Account Created");
					}else {
						System.out.println("Customer already exists");
					}
					break;
					
				case 2:
					int accIdLogin = 0;
					boolean accIdExists = true;
					while(accIdExists) {
						System.out.println("Please provide your account id");
						int accountIds = scan.nextInt(); 
						if(walletDao.getCustomer(accountIds) == null) {
							System.out.println("\nAccount ID does not exists\n");
						}else {
							accIdLogin = accountIds;
							accIdExists = false;
							break;
						}
					}
					System.out.println("Please provide your password");
					String passwordLogin = scan.next();
					
					if(walletDao.login(accIdLogin, passwordLogin)) {
						showMainMenu = false;
						subMenu = true;
						while(subMenu) {
							System.out.println("Please select one of the options \n"+
									"1. Add fund to account\n"+
									"2. Show available funds\n"+
									"3. Show account information\n"+
									"4. Transfer fund to other account\n"+
									"5. Withdraw funds\n"+
									"6. Logout and go back to main menu");
							switch(scan.nextInt()) {
								case 1: 
									System.out.println("Enter amount to add");
									double amount = scan.nextDouble();
									
									System.out.println("\nYour new account balance is $"+
											walletDao.addFunds(accIdLogin, amount)+"\n");
									break;
								case 2:
									System.out.println("\nYour account balance is: $"+
											walletDao.getBalance(accIdLogin)+"\n");
									break;
								case 3:	
									System.out.println("\nYour account information is: \n"+
											walletDao.showAccountInfo(accIdLogin).toString()+"\n");
									break;
								case 4:
									System.out.println("Please provide the account ID for the account you want to transfer funds to");
									int recieverId = scan.nextInt();
									
									System.out.println("Please enter amount you want to send");
									double sendAmount = scan.nextDouble();
									
										if(walletDao.enoughFunds(accIdLogin, sendAmount)){
											if(walletDao.transferFunds(accIdLogin, recieverId, sendAmount)) {
											System.out.println("\nYou succesfully sent $"+sendAmount+" to "+
												walletDao.getCustomer(recieverId).getName()+". \nYour new account balance is $"+
												walletDao.getBalance(accIdLogin)+"\n");
										}else {
											System.out.println("\nCustomer with customer id " + recieverId+" does not exists\n");
										}
									}else {
										System.out.println("\nYou do not have enough balance on your account\n");
									}
									break;
								case 5: 
									System.out.println("Enter amount you want to withdraw");
									double amountToWithdraw = scan.nextDouble();
									if(walletDao.enoughFunds(accIdLogin, amountToWithdraw)) {
										System.out.println("You sucefully withdrew $"+amountToWithdraw+" your new account balance is: $"+
												walletDao.withdrawFunds(accIdLogin, amountToWithdraw));
									}else {
										System.out.println("\nYou do not have enough funds in your account\n");
									}
									break;
								case 6: showMainMenu = true;
									subMenu = false;
									accIdLogin = 0;
									break;
							}
						}
					}else {
						System.out.println("Wrong Password");
					}
					break;
				case 3: System.exit(0);
				default: 
					System.out.println("Not valid Entry");
					break;
			}
		}
	}
}
