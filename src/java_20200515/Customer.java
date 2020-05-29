package java_20200515;
//Customer 클래스
public class Customer {
	//클래스의 멤버 변수 - instance 변수, static 변수, final 변수
	//인스턴스 변수(name, email, phone, balance, isReleased)
	//인스턴스 변수 = 객체가 생성될 때만 만들어지는 변수.
	public String name;
	public String email;
	public String phone;
	public double balance;
	public boolean isReleased;
	public static double interestRate;
	//상수는 대문자로 쓰는 것이 관례
	//상수는 한번 정해지면 값을 변경할 수 없으므로 일반적으로  static final로 사용한다.
	public static final String BANKNAME = "신한은행"; 
	

}
