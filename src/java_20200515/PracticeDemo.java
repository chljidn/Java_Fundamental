package java_20200515;

public class PracticeDemo {
	public static void main(String[] args) {
		//객체 생성 및 instance변수를 각각 객체의 변수로 할당
		Practice c1 = new Practice(); // 클래스 c1 객체 생성
		c1.name = "최지우"; //name과 phone는 instance 변수
		c1.phone = "010-3039";//때문에 각각의 객체로 접근하여 개별로 수정가능.
		System.out.println("c1의 이름: "+c1.name);
		System.out.println("c1의 전화번호: "+c1.phone);
		System.out.println("c1의 은행:"+Practice.BANKNAME);
		
		
		
		Practice c2 = new Practice();//클래스 c2 객체 생성
		c2.name = "빌게이츠";
		c2.phone = "010-2222";
		Practice.interestRate = 2.1;//interestRate는 static변수.
		                            //'class.variablename'로 불러오는 것이 좋음.
		                            //'c2.interestRate'로도 가능.
		                            //어느 객체에서 수정해도 전체 객체에서 다 바뀜. 애초에 static 변수는 객체에 포함되지 않고 따로 존재함.
		System.out.println("c2의 이름: "+c2.name);
		System.out.println("c2의 전화번호: "+c2.phone);		
		System.out.println("c2의 이자율: "+Practice.interestRate);
		
		
				
		Practice c3 = new Practice();//클래스 c2 객체 생성
		c3.name = "워렌버핏";
		c3.phone = "010-3333";
		Practice.interestRate = 4.3;
		// c3.BANKNAME = "국민은행"; // final변수는 상수이기 때문에 변하지 않음. 
		                            // final변수는 static final로 사용. instance 변수로 하여 각각의
		                            // 객체에 할당하면 잡아먹는 데이터 용량이 커져서 손실.
		System.out.println("c3의 이름: "+c3.name);
		System.out.println("c3의 전화번호: "+c3.phone);
		System.out.println("c3의 이자율: "+Practice.interestRate);
		System.out.println("c2의 이자율: "+Practice.interestRate);
	
		
		
		
		Practice c4 = c3; //레퍼런스이기 때문에 참조하여 c4생성.  
		c4.name = "일론 머스크";//참조했기 때문에 c3.name도 일론 머스크로 바뀜
		System.out.println("c4의 이름: "+c4.name);
		System.out.println("c3의 이름: "+c3.name);
		
		
		//-----------------------------------------------------------------------------------
		//protected변수 할당
		c1.email = "abc@nver.com";
		c2.email = "aaa@nver.com";
		c3.email = "aba@nver.com";
		
		Practice.address = "서울";
		
		System.out.println("c1의 email"+c1.email);
		System.out.println("c2의 email"+c2.email);
		System.out.println("c3의 email"+c3.email);
		System.out.println(Practice.address);
		System.out.println(Practice.SECRETE);
		
		//-----------------------------------------------------------------------------------
		
		
		

		
	}

}
