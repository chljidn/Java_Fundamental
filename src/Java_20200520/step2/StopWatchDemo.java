package Java_20200520.step2;

public class StopWatchDemo {
	public StopWatchDemo() { //생성자
		StopWatch s1 = new StopWatch();
		s1.start();
		//StopWatch.start();
		for (long i = 0; i < 20000000000l; i++) {
			
		}
		s1.stop();
		
		double elapsedTime = s1.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
		
}
