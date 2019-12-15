package fr.epita.homework.launcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.epita.homework.datamodel.Birthday;

public class BirthdayLauncher {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input;
		List<String> friends = new ArrayList<String>();

		System.out.println("---Enter as many friends as you like along with their Date of birth---");
		System.out.println("Format: FriendName DD MM YYYY");

		while (scanner.hasNextLine()) {
			input = scanner.nextLine();

//			System.out.println(input.equals("0"));
//			 if (input == "0") {
			if (input.equals("0")) {
				break;
			}

			friends.add(input);
		}
		
		if (! friends.isEmpty()) {
			Birthday friendsArray = new Birthday(friends);
			
			for (String friend: friendsArray.manipulateDates()) {
				System.out.println(friend);
			}
		}

		System.out.println("Exit from loop");

		scanner.close();
	}

}
