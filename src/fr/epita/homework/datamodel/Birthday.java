package fr.epita.homework.datamodel;

import java.util.Arrays;
import java.util.List;

public class Birthday {
	private List<String> details;
	
	public Birthday(List<String> details) {
		this.details = details;
		this.manipulateDates();
	}
	
	private void manipulateDates() {
		int todaysDays = 31;
		int todaysMonths = 12;
		int todaysYear = 2019;
		
		String [] friendDetailArray;
		
		
		for (String friend: this.details) {
			friendDetailArray = friend.split(" ");
		}
	}
	
}
