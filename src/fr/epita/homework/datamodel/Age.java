package fr.epita.homework.datamodel;

public class Age {

	private int birthYears = 0;
	private int birthMonths = 0;
	private int birthDays = 0;

	private int totalDays = 0;

	private int todaysDays = 0;
	private int todaysMonths = 0;
	private int todaysYear = 0;

	private int livedYears = 0;
	private int livedMonths = 0;
	private int livedDays = 0;

	public Age(int birthYears, int birthMonths, int birthDays, int todaysYear, int todaysMonths, int todaysDays) {
		this.birthYears = birthYears;
		this.birthMonths = birthMonths;
		this.birthDays = birthDays;
		
		this.todaysYear = todaysYear;
		this.todaysMonths = todaysMonths;
		this.todaysDays = todaysDays;

		this.calculateDays();
		this.setDates();
	}

	private void calculateDays() {
		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (this.birthDays > this.todaysDays) {
			this.todaysMonths = this.todaysMonths - 1;
			this.todaysDays = this.todaysDays + months[this.birthMonths - 1];
		}

		if (this.birthMonths > this.todaysMonths) {
			this.todaysYear = this.todaysYear - 1;
			this.todaysMonths = this.todaysMonths + 12;
		}

		int calculatedDays = this.todaysDays - this.birthDays;
		int calculatedMonths = this.todaysMonths - this.birthMonths;
		int calculatedYears = this.todaysYear - this.birthYears;

		this.setTotalDays(calculatedYears * 365 + calculatedMonths * 30 + calculatedDays);
	}

	public int getTodaysYear() {
		return this.todaysYear;
	}

	private void setDates() {
		this.livedYears = this.totalDays / 365;
		this.livedMonths = (this.totalDays % 365) / 30;
		this.livedDays = ((this.totalDays % 365) % 30);
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	public int getLivedYears() {
		return livedYears;
	}

	public void setLivedYears(int livedYears) {
		this.livedYears = livedYears;
	}

	public int getLivedMonths() {
		return livedMonths;
	}

	public void setLivedMonths(int livedMonths) {
		this.livedMonths = livedMonths;
	}

	public int getLivedDays() {
		return livedDays;
	}

	public void setLivedDays(int livedDays) {
		this.livedDays = livedDays;
	}

	public int getNextBirthday() {		
		int currentDays = absoluteDay(this.todaysMonths, this.todaysDays);
		int birthDayDays = absoluteDay(this.birthMonths, this.birthDays);

		int nextBirthdays = (birthDayDays - currentDays) >= 0 ? (birthDayDays - currentDays)
				: 365 - (currentDays - birthDayDays);
		   
		return nextBirthdays;
	}

	public int absoluteDay(int month, int day) {
		// { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] days = { 0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };

		return days[month] + day;
	}
}
