package Java_20200525;

public class TryCatchDemo {
	
	public static double getAvg(int first, int second) {
		int sum = first + second;
		double avg = (double) sum/2;
		return avg;
	}
	

	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]); //run configurations에서 Arguments를 통해서 인자값을 넣어줘야 함.
			int english = Integer.parseInt(args[1]);
			
			double average = getAvg(korean, english);
			System.out.printf("평균 : %f", average);
		}catch(ArrayIndexOutOfBoundsException e) {//예외클래스의 상속클래스 중 상위클래스일수록 밑으로 와야함. 즉, 
			                                      //exception e를 사용하는 catch는 ArrayIndexOutOfBoundsException e를 사용하는 catch보다 밑에 있어야 한다.
			//System.out.println("예외 메세지 : "+e.getMessage());
			//System.err.println("2개 넣어!"); //에러메세지는 보통 "Sysotem.err.~~"를 사용함. print.out을 사용해도 상관은 없음.
			e.printStackTrace(); //어디서 에러가 발생하는지 보여줌.
		
		/*
		 * 일반 출력 : System.out
		 * 에러 출력 : System.err
		 */
		}catch(NumberFormatException e){
			System.err.println("예외 메세지 : " + e.getMessage());
			System.err.println("문자말고 숫자 넣어!");
		}finally { //에러가 나던, 나지 않던 무조건 수행.
			System.out.println("finally");
		}
		
		//catch 블럭이 여러개 있을 경우 위에서 부터 하위 클래스 => 상위 클래스 순으로 정한다.
	}
	
	

}
