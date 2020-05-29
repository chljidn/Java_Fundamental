package Java_20200525;

public class hello {
	
	public static void main(String[] args) {
		String str = "Hello world";
		
		//Hello World를 거꾸로 뽑아보기
		for(int i = str.length()-1 ; i>=0; i--) {
			System.out.printf("%s",str.charAt(i)); // String변수명.charAt(index) 메서드는 String 문자열의 원소값을 알려줌. 
			
		}
		
	}

}
