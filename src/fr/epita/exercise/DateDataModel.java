package fr.epita.exercise;

import java.util.LinkedHashMap;
import java.util.Map;

public class DateDataModel {
	
	private static final int[] daysInMonths = {31, 28};
	
	private static final Map<Integer, Integer> daysInMonthsHashMap = new LinkedHashMap<Integer, Integer>();
	
	static {
		daysInMonthsHashMap.put(1, 31);
		daysInMonthsHashMap.put(1, 28);
	}
	
	public static void main(String []args) {
		int dayInJanuary = daysInMonths[0];
		
		dayInJanuary = daysInMonthsHashMap.get(1);
		
		dayInJanuary = DaysInMonthEnum.JANUARY.getDaysInMonth();
	}
}
