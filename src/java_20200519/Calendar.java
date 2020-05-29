package java_20200519;
/**
 Calendar 클래스는 엄청난 클래스
 */
public class Calendar {
	private int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static final int SUNDAY = 0;
	public static final int MUNDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	
	
	public Calendar() {		
	}
	
	
	
	//전체 날짜를 구하는 함수
	private int getCount(int year, int month, int day) {
		
		int total=0;
		int preyear = year-1;
		
		total = (preyear*365)+(preyear/4 - preyear/100 + preyear/400);
		boolean isLeafYear = isLeafYear(year);
		
		if(isLeafYear) {
			monthArray[1] = 29;
		}
		
		for (int i = 0; i < month-1; i++) {
			total += monthArray[i];
		}
			
		total += day;
	
		return total;
	}
		
	//윤년인지 아닌지를 판단하는 isLeafYear 메서드 - 지역변수는 year, 반환값은 boolean
	private boolean isLeafYear(int year) {
		boolean isLeafYear = year%4 == 0 && year%100 != 0 || year%400 == 0;
		return isLeafYear;		

	}
	
	public void print(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//2020년 5월 1일 날짜를 구해서 1일 이전 날자까지 빈공백 처리
		
		int total = getCount(year, month, 1);
		int rest = total % 7;
		
		for(int i=0;i<rest;i++) {
			System.out.print("\t");
		}
		
		for(int i = 1;i<=getLastDay(year,month);i++) {
			System.out.print(i+"\t");
			rest++;
			if(rest%7==0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}
	
	
	
	//monthArray배열에서 year이 윤년인지 아닌지를 판단하여 윤년이면 monthArray의 두번째 방의 값을 29로 변경해야 함.
	private int getLastDay(int year, int month) {
		
		boolean isLeafYear = isLeafYear(year);
		
		if (isLeafYear) {
			monthArray[1] = 29;
		}
		return monthArray[month-1];
	}

	
	
	/**
	 년을 출력해주는 메서드 입니다. 
	 */
	public void print(int year) {
		for(int i=1;i<=12;i++) {
			print(year, i);
		}
	}
	/**
	 요일을 출력해주는 메서드 입니다. 
	 */
	public void print(int year, int month, int day) {
		
		int total = getCount(year, month, day);	
		int dayOfWeek = total%7;
		String message = null;
		if (dayOfWeek == Calendar.MUNDAY) {
			message = "월요일";
		}else if (dayOfWeek == Calendar.TUESDAY) {
			message = "화요일";
		}else if (dayOfWeek == Calendar.WEDNESDAY) {
			message = "수요일";
		}else if (dayOfWeek == Calendar.THURSDAY) {
			message = "목요일";
		}else if (dayOfWeek == Calendar.FRIDAY) {
			message = "금요일";
		}else if (dayOfWeek == Calendar.SATURDAY) {
			message = "토요일";
		}else 
			message ="일요일";

		System.out.println(year+"년"+month+"월"+day+"일은"+message+"입니다.");

	}
	
	
}
