package Java_20200525;

public class ExceptionSampleDemo {
	public static void main(String[] args) {
		String msg = null;
		//NullpointerException 예외 발생
		int msgLength = msg.length(); //null인 상태에서 길이넣으려고 하면, 길이가 없기에 예외처리됨.
		System.out.println(msgLength);
		
		//--------------------------------------------------------------
		
		//int[] array = {1, 2, 3};
		//ArrayIndexOutOfBoundsException 예외 발생
		//int temp = array[3]; //배열의 크기를 넘어서는 예외발생
		
		//--------------------------------------------------------------
		
		//ArithmeticException 예외 발생
		//int result = 3/0;
		//System.out.println(result);
		
		//--------------------------------------------------------------
		
		//NumberFormatException 예외발생
		//int first = Integer.parseInt("a");
		//System.out.println(first);
		//Integer 클래스의 parseInt메서드는 숫자로 바꿔주는 역할을 하는데 문자인 a가 들어와서
		//예외가 발생함.
	}

}
