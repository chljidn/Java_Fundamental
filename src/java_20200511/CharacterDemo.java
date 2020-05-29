package java_20200511;

public class CharacterDemo {
	public static void main(String[] args) {
		// 평균적으로는 string 문자열을 사용하고, 임의의 문자열을 출력하기 원할  때 평균적으로 character를 쓰게 됨.
		//1. 유니코드 표현 => '\u0000'
		char c1 = '\uCD5C';
		char c2 = '\uC9C0';
		char c3 = '\uC6B0';		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//2. 아스키 코드 표현
		//48 - 57 => 0-9
		//65 - 90 => A-Z
		//97 - 122 => a-z
		
		char c4 = 97;
		System.out.println(c4);
		
		//3. 문자 표현법
		char c5 = '성';
		System.out.println(c5);
		
		
		char c6 = '\'';
		char c7 = '\\';
		char c8 = '\"';
		String s1 = "\\";
		String s2 = "\"";
		String s3 = "\'";
		System.out.println("aa"+"\t"+"bb");//\t는 tab만큼 간격을 띄움
		System.out.println("aa"+"\n"+"bb");//\n은 다음 칸으로 넘어감(enter와 같음)
		System.out.println("aa"+"\r"+"bb");
	}

}
