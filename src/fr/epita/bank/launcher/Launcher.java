package fr.epita.bank.launcher;

import fr.epita.bank.SavingAccount;

public class Launcher {

	public static void main(String [] args) {
		
		SavingAccount savingAccount = new SavingAccount();
		double interest = savingAccount.computeInterest();
		System.out.println(interest);
		savingAccount.withDraw(3000.0);
		System.out.println(savingAccount.getBalance());
	}
}
