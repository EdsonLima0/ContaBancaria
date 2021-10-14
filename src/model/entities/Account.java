package model.entities;

import model.exceptions.LimitException;
import model.services.ServiceAccount;

public class Account implements ServiceAccount {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
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

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}

	public double validateWithdraw(double amount) {
		if (amount > getWithdrawLimit() && amount < getBalance()) {
			throw new LimitException("Operação não permitida: Valor Solicitado maior que o limite permitido!");
		}
		if (amount > getBalance()) {
			throw new LimitException("Operação não permitida: Saldo inferior a quantia solicitada.");
		}
		return amount;
	}

}
