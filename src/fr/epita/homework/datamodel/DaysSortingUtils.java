package fr.epita.homework.datamodel;

import java.util.ArrayList;
import java.util.List;

public class DaysSortingUtils {

	public List<String> sortDays(List<String> friendsList) {
		List<String> sortedData = new ArrayList<String>();

		for (int i = 0; i < friendsList.size(); i = i + 2) {
			for (int j = 2; j < friendsList.size(); j = i + 2) {
				int iFriendBirthDay = Integer.parseInt(friendsList.get(i + 1));
				int jFriendBirthDay = Integer.parseInt(friendsList.get(j + 1));
			}
		}

		return sortedData;
	}

}
