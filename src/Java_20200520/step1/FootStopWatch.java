package Java_20200520.step1;

public class FootStopWatch {
	
	long startTime; //전역변수 startTime 생성
	long endTime; //전역변수 endTime 생성

	
	//메서드 생성
	public double getElapsedTime() {
		return (double)(endTime - startTime) / 1000;				
	}
	
	public static void main(String[] args) {
		//1970년 1월 1일부터 지금까지 시간을 밀리 세컨드로 반환.
		
		FootStopWatch f1 = new FootStopWatch();
		
		f1.startTime = System.currentTimeMillis();
		
		for (long i = 0; i<7_000_000_000l; i++) {
		}
		
		f1.endTime = System.currentTimeMillis();
		double elapsedTime = f1.getElapsedTime();
		
		
		System.out.printf("경과시간 : %.3f", elapsedTime); //double면  %f를 사용하고 %.3f는 소수점 이하 3자리까지 표현하라는 뜻.		
	}

}
