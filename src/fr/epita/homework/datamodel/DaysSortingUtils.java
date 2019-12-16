package fr.epita.homework.datamodel;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author kuwar
 *
 */
public class DaysSortingUtils {

	public Map<String, Integer> sortByDays(Map<String, Integer> friendsList) {
		Map<String, Integer> sortedData = new LinkedHashMap<String, Integer>();

//		for (Map.Entry<String, Integer> friendI: friendsList.entrySet()) {
//			System.out.println(friendI.getKey() + "---" + friendI.getValue());
//		}

		sortedData = friendsList.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> {
					throw new AssertionError();
				}, LinkedHashMap::new));

		return sortedData;
	}
}
