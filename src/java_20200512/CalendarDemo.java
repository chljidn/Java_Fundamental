package java_20200512;

public class CalendarDemo {
	
	public static void main(String[] args) {
		/*
		 * 달력 만들기
		 * 1. 1년 1월 1일 월요일
		 * 2. 1년은 365일, 윤년일때는 366일(2월 29일)
		 * 3. 윤년은 4년마다 발생하고, 그중에 100의 배수는 제외하고, 400의 배수는 제외하지 않는다.
		 * 4. 2020년 5월 12일은 무슨요일 일까?
		 * 5. 2019년까지 총일수 + 4월까지 총일수 + 12 더해서 7로 나눈 나머지가 1이면 월요일, 2이면 화요일,.....
		 * 
		 * 
		 * */
		int year = 2020;
		int month = 5;
		int day = 12;
		int total=0;
		//int total = ((2019*365)+(2019/4)-(2019/100)+(2019/400)+31+29+31+30+12);
		int preyear = year-1;
		total = (preyear*365)+(preyear/4 - preyear/100 + preyear/400);
		total += 31+29+31+30;
		total += day;
		
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
		
		System.out.println(total);
		System.out.println(preyear);
		System.out.println(rest);
		System.out.println(year+"년"+month+"월"+day+"일은"+message+"입니다.");
		
		// Switch문
		switch(rest) {
		case 1 : message="월요일"; break;
		case 2 : message="화요일"; break;
		case 3 : message="수요일"; break;
		case 4 : message="목요일"; break;
		case 5 : message="금요일"; break;
		case 6 : message="토요일"; break;
		default : message="일요일";
		}
		System.out.println(year+"년"+month+"월"+day+"일은"+message+"입니다.");
		
		
		
	}

}
