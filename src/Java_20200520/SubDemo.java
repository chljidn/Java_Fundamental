package Java_20200520;

public class SubDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s1 = new Super();
		System.out.println(s1.age);
		s1.playbadook();
		s1.work();
		
		Sub s2 = new Sub();
		System.out.println(s2.height);
		s2.playGame();
		s2.work();//??
		
		s2.age = 20;
		System.out.println(s2.age);
		s2.playbadook();
		
		Super s3 = new Sub(); //타입(Super)에 의해서 호출할 수 있는 클래스가 정해짐.
		                      //타입(super)이 보통 추상클래스일 경우 이렇게 형변환을 사용함. 일반 클래스일 경우는 굳이 이렇게 사용할 필요가 없음.
		System.out.println(s3.age);
		s3.playbadook();
		s3.work(); //오버라이딩으로 인하여 자식클래스의 work()가 호출된다.
		
		//s3.height = 20; - 형변환으로 인하여 부모 클래스 안에 있는것만 호출되기 때문에 자식 클래스 안에 있는 height는 호출되지 않음.
		//s3.playGame(); - 형변환으로 인하여 자식 클래스의 메서드이므로 호출 불가.
		
		Super s4 = s2;
		System.out.println(s4.age);//s4가 가리키는 곳은 super지만 s2에서 age를 20으로 바꾸었기 때문에 50이 아니라 참조한 값인 20이 출력됨.

	}

}
