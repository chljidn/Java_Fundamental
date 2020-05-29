package java_20200513;

public class BreakDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i==5) break;
			sum += i;
			
		}
		System.out.printf("1부터 5까지 합은 %d 입니다. %n", sum);
		
		outter:for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(i==5 && j == 6) break outter;//첫 for문에 outter레이블을 붙여주고, 안쪽 for문에서 break outter;를 
				System.out.printf("%d * %d = %d%n",i,j,i*j); //쓰면 바깥 for문으로 빠져나갈 수 있음.
				
			}
			
		}
	}

}
