package java_20200514;

public class PrimeNumber {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			boolean Prime = true; // prime변수의 초기값 지정.
			for (int j = 1; j < i; j++) {
				if (j!=1 && i%j == 0) {	//소수가 아니면 prime 변수는 false가 됨.
					Prime = false;
				}

			}
			if (i!= 1 && Prime == true) { //소수 출력
				System.out.printf("%d ", i);
			}
			
		}
		
		
	}

}
