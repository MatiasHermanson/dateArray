package date_array;

public class MyDate 
{
	int day;
	int year;
	String month;
	
	public MyDate(String month, int day, int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public String toString()
	{
		return month + " " + day + ", " + year;
	}
}
