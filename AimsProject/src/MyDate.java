
import java.util.Calendar;
import java.util.HashMap;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		Calendar calendar = Calendar.getInstance();
		this.day = calendar.get(Calendar.DATE);
		this.month = calendar.get(Calendar.MONTH) + 1; //Since January <=> Calendar.MONTH == 0 and so on
		this.year = calendar.get(Calendar.YEAR);
	}

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public MyDate(String date) {
		String[] dtime = date.split(" ");
		HashMap<String, Integer> dmonth = new HashMap<String, Integer>();
		dmonth.put("January", 1);
		dmonth.put("February", 2);
		dmonth.put("March", 3);
		dmonth.put("April", 4);
		dmonth.put("May", 5);
		dmonth.put("June", 6);
		dmonth.put("July", 7);
		dmonth.put("August", 8);
		dmonth.put("September", 9);
		dmonth.put("October", 10);
		dmonth.put("November", 11);
		dmonth.put("December", 12);
		
		this.day = Integer.parseInt(dtime[1].substring(0, dtime[1].length() - 2));
		this.month = dmonth.get(dtime[0]);
		this.year = Integer.parseInt(dtime[2]);
	}
	
	
	public void printDate() {
		System.out.println(this.month + "/" + this.day + "/" + this.year);
	}
}
