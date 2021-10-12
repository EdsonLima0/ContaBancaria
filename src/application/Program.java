package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.LimitException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		try {
		System.out.println("Informe os dados da conta");
		System.out.print("Numero Cliente: ");
		int number = sc.nextInt();
		System.out.print("Cliente: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de crédito: ");
		double withdrawLimit = sc.nextDouble();

		Account ac = new Account(number, holder, balance, withdrawLimit);

		System.out.println();
		System.out.print("Informe a quantia a levantar: ");
		double amount = sc.nextDouble();

		ac.withdraw(amount);
		System.out.printf("Saldo atualizado: %.2f%n", ac.getBalance());
		
		}
		
		catch (LimitException e) {
			System.out.println(e.getMessage());
		}
		
		
		catch (InputMismatchException e) {
			System.out.println("Parametro Inválido!");
		}

		sc.close();
	}
}