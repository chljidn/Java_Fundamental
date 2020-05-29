package java_20200521;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1==s2); //false - 같은 객체를 참조하는지 판단.
		System.out.println(s1.contentEquals(s2)); //true - 문자열의 내용이 같은지 판단
		
		Customer c1 = new Customer("성영한","제주도");
		Customer c2 = new Customer("성영한","제주도");
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2)); //오버라이딩 하게되면 객체 안에 있는 내용을 비교하게 됨.
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1); //(c1.toString()) - 에서 toString()가 생략되어 있는 것.
		                        //toString 메서드를 오버라이딩 하면 객체 안의 내용이 나오게 됨.
		System.out.println(s1); //(s1.toString()) - 에서 toString()가 생략되어 있는 것.
		
	}

}
