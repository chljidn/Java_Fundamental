package java_20200512;

public class SwitchDemo {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = null;
		//month => 수식(char, byte, short, int, string)
		switch(month) {
		//case 평가값 => 반드시 유일해야 한다.
		//case 절에 break가 없으면 아래의 case로 이동한다.
		case 12 : season="겨울";
		case 1 : season="겨울";
		case 2 : season="겨울"; break;
		case 3 : season="봄";
		case 4 : season="봄";
		case 5 : season="봄"; break;
		case 6 : season="여름";
		case 7 : season="여름";
		case 8 : season="여름"; break;
		case 9 : season="가을";
		case 10 : season="가을";
		case 11 : season="가을"; break;
		//default의 위치는 어디에 있든 상관없음.
		//마지막 문장에 있으며 break문을 사용하지 않지만 다른 곳에 있을 경우에는 break문을 사용해야 한다.(필수는 아니지만 예상몬한 결과가 발생할 수 있다)
		default : season="없는 계절";
		}
		System.out.println(month+"월은"+season+"입니다.");
	}

}
