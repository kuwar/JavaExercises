package fr.epita.homework.launcher;

import java.util.InputMismatchException;
import java.util.Scanner;

import fr.epita.homework.datamodel.Age;

public class Launcher {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("--- Enter Date of Birth ---");
		System.out.println("Years: ");
		int birthYears = getAnInteger(scanner);
		System.out.println("Months: ");
		int birthMonths = getAnInteger(scanner);
		System.out.println("Days: ");
		int birthDays = getAnInteger(scanner);

		System.out.println("");

		System.out.println("--- Enter Today's Date ---");
		System.out.println("Years: ");
		int todaysYear = getAnInteger(scanner);
		System.out.println("Months: ");
		int todaysMonths = getAnInteger(scanner);
		System.out.println("Days: ");
		int todaysDays = getAnInteger(scanner);

		if (birthYears > todaysYear) {
			System.out.println("Really!! you are born in Future??");
			System.exit(0);
		}

		Age age = new Age(birthYears, birthMonths, birthDays, todaysYear, todaysMonths, todaysDays);

		System.out.println("My age : " + age.getLivedYears() + " years " + age.getLivedMonths() + " months " + age.getLivedDays() + " days");
		System.out.println("My age in days: " + age.getTotalDays() + " days");
		
		System.out.println(age.getTodaysYear());

		scanner.close();
	}

	public static int getAnInteger(Scanner sc) {
		while (true) {
			try {
				return sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
				System.out.print("That’s not an integer. Try again: ");
			}
		}
	}

}
