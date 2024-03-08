package com.day4;

public class Bank2 {

	
	private int accountnumber;
	
	public String accountholdername;
	public int phonenumber;
	public String address;
	
	private double balance;
	private int pin;
	private String password;
	
	public String username;
	private int SSN;
	
	
	public  void BankAccount( int accountnumber, double balance, int pin, String password, int SSN) {
		this.accountnumber =accountnumber;
		this.balance=balance;
		this.password = password;
		this.pin = pin;
		this.SSN= SSN;
		
	}
	
	String [] Acccountname = {"john", "kwami", "kim", "George"};
	
    int [] accountnumber1= {12344, 44637, 34567, 45678};
    int[] pin2 = {2345,3456,6789,4567};
    double balance = 0;
    
    
    
    
	
	
	 for (int i=0; i<Accountname.lengh; i++) {
		 System.out.println(i);
	 }
	
}
