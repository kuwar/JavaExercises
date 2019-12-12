package fr.epita.exercise;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial fact = new Factorial();
		
		System.out.println(fact.getFactorialIterative(4));
		System.out.println(fact.getFactorialRecursive(4));
	}

}
