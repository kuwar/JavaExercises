package fr.epita.bank;

public class SavingAccount extends Account{
	
	double interestRate;
	
	public double computeInterest() {		
		// implicit reference to this ie balance here is this.balance
		return (this.getBalance() * this.interestRate) / 100;
	}
	
	public void withDraw(double amount) {
		
		this.setBalance(this.getBalance() - amount);
		
//		return (balance - amount);
	}
}
