package fr.epita.exercise;

public class Factorial {
	
	public double getFactorialIterative(int number) {
		double accumulator = 1;
		for (int i = 1; i <= number; i++) {
			accumulator *= i;
		}
		
		return accumulator;
	}
	
	public double getFactorialRecursive(int number) {
		if (number <= 1) {
			return 1;
		}
		
		return number * getFactorialRecursive(number - 1);
	}
	

}
