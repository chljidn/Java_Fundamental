package Java_20200525;

public class ThrowsDemo {
	public static int getDivide(int first, int second) throws ArithmeticException {
		int result = first / second; //예외가 발생하는 코드
		
		return result;
	}
	
	
	public static void main(String[] args) { //getDivide메서드에서 throws ArithmeticException을 했을 경우 ArithmeticException은 RuntimeException의 
		                                     //하위 클래스이기 때문에 사용하는 곳에서 예외처리를 해도되고 안해도 됨.
		                                     //하지만 getDivide 메서드에서 throw Exception을 했을 경우, 사용하는 곳에서 반드시 exception에 대한 예외처리를 해줘야 함.
		                                     //(보통은 main메서드에서 사용하기 때문에 main메서드에서 예외처리를 함)
		try {
			int first = Integer.parseInt(args[0]); //예외가 발생하는 코드
			int second = Integer.parseInt(args[1]); //예외가 발생하는 코드
			
			
			int result = getDivide(first, second);
			System.out.printf("결과 : %d%n", result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("인자를 2개 입력하셔야 합니다.");
		}catch(NumberFormatException e) {
			System.err.println("인자에는 숫자를 넣어야 합니다.");
		}catch(ArithmeticException e){ //이렇게 예외처리를 하지않으면 프로그램을 종료시켜버리기 때문에, 예외가 일어난 것 이후로 계속 프로그램을 실행시키기 위해서는 예외처리를 꼭 해주어야 함.
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("finally");
		}
	
	}

}

