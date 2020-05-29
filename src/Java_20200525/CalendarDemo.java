package Java_20200525;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//밀리세컨드를 년,월,일,시,분,초로 바꿀수 있는 메서드
		//cal.setTimeInMillis(1589168672259);
		
		
		/*int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year+","+month+","+day);
		System.out.println(hour+","+minute+","+second );*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a hh:mm:ss E요일");
		String date = sdf.format(cal.getTime());
		System.out.println(date);
	}

}
