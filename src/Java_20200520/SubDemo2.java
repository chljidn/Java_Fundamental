package Java_20200520;

public class SubDemo2 {
	public static void change(Super sup) {
		System.out.println(sup.age);
		sup.age = 20;
		sup.playbadook();
		sup.work(); //sub work() 호출 - 이유: overriding 메서드는 자식 메서드가 호출됨
	}

	public static void main(String[] args) {
		Sub s1 = new Sub();
		System.out.println(s1.age);
		
		change(s1);
		
		System.out.println(s1.age);
	}

}
