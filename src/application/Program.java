package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;



public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//Account ac = new Account(Integer number, String holder, double balance, double withdrwaLimit);
		Account ac = new Account();
	
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		sc.nextLine();
		System.out.print("Initial balance: ");
		ac.setBalance(sc.nextDouble());
		System.out.print("Withdraw limit: ");
		double lWithdraw = sc.nextDouble();
		System.out.println();
		
		System.out.print("Enter amount for withdraw: " );
		ac.setWithdraw(sc.nextDouble());
		
		System.out.println("New balance: " + ac.newBalance() );
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
