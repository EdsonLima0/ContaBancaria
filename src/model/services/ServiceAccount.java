package model.services;

public interface ServiceAccount {

	public double validateWithdraw(double amount);
	
	public void withdraw(double amount);

	public void deposit(double amount);

	public void setBalance(Double balance);

	public void setWithdrawLimit(Double withdrawLimit);
	
	public Double getBalance();
	
	public double getWithdrawLimit();
	
	

}