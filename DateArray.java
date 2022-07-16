package date_array;

public class DateArray {

	public static void main(String[] args) {
		
		MyDate[] dateArr = new MyDate[4];
		dateArr[0] = new MyDate("May",16,1984);
		dateArr[1] = new MyDate("November",14,1978);
		dateArr[2] = new MyDate("September",21,1980);
		dateArr[3] = new MyDate("July",3,1987);
		for (int i = 0; i < dateArr.length; i++)
		{
			System.out.println(dateArr[i]);
		}
	}

}
