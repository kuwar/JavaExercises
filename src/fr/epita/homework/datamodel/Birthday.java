package fr.epita.homework.datamodel;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kuwar
 *
 */
public class Birthday {
	private List<String> details;

	public Birthday(List<String> details) {
		this.details = details;
		this.manipulateDates();
	}

	public Map<String, Integer> manipulateDates() {
		DaysSortingUtils sortedFriendList = new DaysSortingUtils();

		int todaysDays = 31;
		int todaysMonths = 12;
		int todaysYear = 2019;

		int birthYears = 0;
		int birthMonths = 0;
		int birthDays = 0;

		String friendName;

		String[] friendDetailArray;

		Map<String, Integer> upcommingBirthday = new LinkedHashMap<String, Integer>();

		for (String friend : this.details) {
			friendDetailArray = friend.split(" ");
//			System.out.println(Arrays.deepToString(friendDetailArray));

			friendName = friendDetailArray[0];
			birthDays = Integer.parseInt(friendDetailArray[1]);
			birthMonths = Integer.parseInt(friendDetailArray[2]);
			birthYears = Integer.parseInt(friendDetailArray[3]);

			Age age = new Age(birthYears, birthMonths, birthDays, todaysYear, todaysMonths, todaysDays);

			upcommingBirthday.put(friendName, age.getNextBirthday());
		}

		return sortedFriendList.sortByDays(upcommingBirthday);
	}

}
