package java_20200521;
import java.util.ArrayList;
public class WrapperDemo {
	String s1 = "10";
	String s2 = "20";
	public static void main(String[] args) {
		
		/* 
		 자바 1.4이전 버전에서는 primitive data type을 collection에 저장할 수 없었기 때문에
		 primitive data type을 객체화 할 수 있는 wrapper class가 필요함.
		 아래와 같이 1을 추가할 수 없음.
		 collection에 1을 저장하기 위해서는 primitive data type을 객체화 할 수 있는 Integer 클래스로 변환해야 함.
		 */
		ArrayList list = new ArrayList();
		// list.add(1); - 1은 primitive이므로 이렇게 저장할 수 없음. 단, 자바 1.4 버전 이후로는 자동형변환 해주기 때문에 가능함.
		list.add(new Integer(1)); //이렇게 클래스로 바꾸어 주어야 함.
		
		
		
		//1.primitive data type = >wrapper class(new integer(1))
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		
		//2.wrapper class => primitive data type(xxxValue())
		int i3 = i1.intValue()+i2.intValue();
		
		//3.String => primitive data type
		String s1 = "10";
		String s2 = "20";
		int i4 = Integer.parseInt(s1)+Integer.parseInt(s2);
		// int i4 = Integer.parseInt(s1+s2) => 1040이 나옴 - 문자열끼리 먼저 더한후 primitive로 바꾸기 때문.
		
		//4.primitive data type => String
		String s3 = 10+"";
		String s4 = String.valueOf(10);
		
		
		//컴파일러 1.4버전 이후로 이러한 wrapper class 자동형변환을 해줌.
		//primitive data type이 자동으로 wrapper class로 변환하는 것을 auto boxing 이라고 한다.
		Integer i5 = 10;
		Integer i6 = 20;
		
		//wrapper class가 자동으로 primitive data type으로 변환하는 것을 auto un-boxing이라고 한다.
		int i7 = i5 + i6;
		
		

	}

}
