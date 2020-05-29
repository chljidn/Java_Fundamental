package java_20200519;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("chljidn","2023","chljidn@nate.com",1);
		//a.id ="chljidn"; //id가 private이기 때문에 접근 불가
		//a.setId("chljidn");
		//a.setPwd("2023");
		//a.setEmail("chljidn@nate.com");
		//a.setLevel(1);
		
		//String id = a.getId();//밑에서 재사용 할 경우 이렇게 변수 받아서 사용.
		//System.out.println(id);
		System.out.println(a.getId()); //한번만 쓰고 끝낼경우 이렇게 출력해도 됨.
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		Admin a1 = new Admin("shy2022","2222","chy@nver.com");
		System.out.println(a1.getId()); 
		System.out.println(a1.getPwd());
		System.out.println(a1.getEmail());
		System.out.println(a1.getLevel());
		
	}

}
