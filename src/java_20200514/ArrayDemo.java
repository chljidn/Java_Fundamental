package java_20200514;

public class ArrayDemo {
	public static void main(String[] args) {
		//1.배열 선언 및 생성
		int[] a = new int[4];
		
		//2.배열 할당
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		
		//3.배열 출력
		//a.length : 배열의 길이
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		
		//4.배열 선언 , 생성, 할당이 동시에 이루어짐.
		int[] b = {100, 200, 300, 400, 500};
		
		//배열의 값 변경(할당)
		b[0] = 101;
		b[1] = 201;
		b[2] = 301;
		b[3] = 401;
		b[4] = 501;
		
		//배열 출력 => for loop
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println();
		
		//배열 출력 => enhanced for loop
		for(int value : b) {
			System.out.println(value);
		}
		System.out.println();
		
		//참조 - reference는 참조가 가능하지만, primitive는 참조가 불가능하다. 
		//배열은 reference이기 때문에 참조가능.
		int[] c = a; //단, int[] c = a+b; 처럼 사용할 수는 없음. 
		c[0] = 11; //a[0]과 c[0]이 모두 11로 바뀜.
		System.out.println(a[0]);
		System.out.println(c[0]);
		
		System.out.println(b[4-1]);
		
		
	}


}
