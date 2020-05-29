package Java_20200518;

public class Calendar {
	private int year;
	private int month;
	private int day;
	
	public Calendar(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		
	}
	
	//year에 대한 setter 메서드
	//setter 메서드를 이요하여 year를 변경한다.
	public void setYear(int y) {
		this.year = y;
	}
	
	//year에 대한 getter 메서드
	//getter 메서드를 이용하여 year를 변경한다.
	public int getyear() {
		return year;
	}
	//this. : 자기 자신 객체
	//로컬변수와 멤버변수를 구분할 때 사용한다. 예)this.year = year;
	public void set(int y, int m, int d) {
		this.year = y;
		this.month = m;
		this.day = d;
	}
	
	
	
	
	private int getCount() {
		
		int total=0;
		//int total = ((2019*365)+(2019/4)-(2019/100)+(2019/400)+31+29+31+30+12);
		int preyear = year-1;
		
		total = (preyear*365)+(preyear/4 - preyear/100 + preyear/400);
		
		int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//monthArray배열에서 year이 윤년인지 아닌지를 판단하여 윤년이면 monthArray의 두번째 방의 값을 29로 변경해야 함.
		
		if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
			monthArray[1] = 29;
		}
		
		for (int i = 0; i < month-1; i++) {
			total += monthArray[i];			
		}
		System.out.println(monthArray[1]);
		
		
		//total += 31+29+31+30;
		
		total += day;
		return total;
		
	}
	
	
	
	public void print() {
		
		int total = getCount();	
		int rest = total%7;
		String message = null;
		// If문
		if (rest == 1) {
			message = "월요일";
		}else if (rest == 2) {
			message = "화요일";
		}else if (rest == 3) {
			message = "수요일";
		}else if (rest == 4) {
			message = "목요일";
		}else if (rest == 5) {
			message = "금요일";
		}else if (rest == 6) {
			message = "토요일";
		}else 
			message ="일요일";

		System.out.println(year+"년"+month+"월"+day+"일은"+message+"입니다.");

	}
	
	
}
