package java_20200511;

public class LiteralDemo {
	public static void main(String[] args) {
		//byte 범위(-128 ~ 127)을 넘어가면 overflow 발생 => compile error
		byte b = 127;
		
		int a1 = 128;//10진수 표기법
		int a2 = 076;//8진수 표기법
		int a3 = 0x123;//16진수 표기법
		int a4 = 0b1010;//2진수 표기법

		System.out.println(a1);//print로 쓰면 행이 바뀌지 않음.
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		//long 리터럴은 숫자 뒤에 l 또는 L로 표기
		long l1 = 12L;
		
		//float 리터럴은 숫자 뒤에 f 또는 F로 표기
		float f1 = 123.4f;
		
		//double 리터럴은 숫자 뒤에 d 또는 d로 표기, 생략가능
		double d1 = 123.56;
		
		//boolean 리터럴은 true 또는 false;
		boolean IsExisted = false;
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2); //java에서는 +, -등 산술연산을 하면 자동으로 int로 바뀌기 때문에 다시 byte로 바꾸어 주는 것.
		
		System.out.println(b3);
		
		
		
		
	}

}
