package model.entities;

public class Account {

	private Integer number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	private double newBalance;
	private double withdraw;

	
	public Account() {

	}
	
	public Account(Integer number, String holder, double balance, double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;

	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public double getNewBalance() {
		return newBalance;
	}
	
	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public void deposit(double amount) {
		amount =+ amount;
	}

	public void withdraw(double amount) {
		amount =- amount;
	}
	
	public double newBalance() {
		 return balance - withdraw;
	}
}
	
	