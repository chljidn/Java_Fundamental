package java_20200521;

public class ImplementClassDemo {
	public static void main(String[] args) {
		InterA i = new ImplementClass(); //타입이 InterA이기 때문에 i객체 안에서 InterA를 참조함.
		
		i.mA(); //자식클래스에 있는 mA를 호출하게 됨.
		
		i.mB();
		
		i.mC();
		//인터페이스에 있는 변수는 변경 불가(final이기 때문에)
		//InterA.PI = 3.15;
		
		System.out.println(InterA.PI);
	}

}
