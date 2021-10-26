package model.services;

import model.exceptions.LimitException;

public class ValiditService implements ServiceAccount {

	private double limite;
	private double saldo;

	public ValiditService() {
	}

	public ValiditService(double limite, double saldo) {
		this.limite = limite;
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double validateWithdraw(double amount) {
		if (amount > getLimite() && amount < getSaldo()) {
			throw new LimitException("Operação não permitida: Valor Solicitado maior que o limite permitido!");
		}
		if (amount > getSaldo()) {
			throw new LimitException("Operação não permitida: Saldo inferior a quantia solicitada.");
		}
		return amount;

	}

}
