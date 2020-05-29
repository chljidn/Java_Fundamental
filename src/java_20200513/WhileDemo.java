package java_20200513;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i=1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);
		
		int j = 2;
		while(j<=9) {
			int z = 1;
			while(z<=9) {
				System.out.printf("%d*%d = %d%n", j,z,j*z);
				z++;
			}
			j++;
		}
		
		
	}
	

}
