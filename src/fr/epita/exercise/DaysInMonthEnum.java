package fr.epita.exercise;

public enum DaysInMonthEnum {
	JANUARY(1, 31, "January"),
	FEBRUARY(2, 28, "February"),
	;
	
	private int monthIndex;
	private int daysInMonth;
	private String displayName;
	
	private DaysInMonthEnum(int monthIndex, int daysInMonth, String displayName) {
		this.monthIndex = monthIndex;
		this.daysInMonth = daysInMonth;
		this.displayName = displayName;
	}

	public int getMonthIndex() {
		return monthIndex;
	}

	public int getDaysInMonth() {
		return daysInMonth;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	
	
}
