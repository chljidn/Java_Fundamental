package Java_20200520.step3;

public class StopMilliWatch {
	//밀리세컨드를 관리하기 위한 변수
	long startTime;
	long endTime;
	
	//밀리세컨드의 경과시간 메서드
	public double getElapsedTime() {
		return (double)(endTime - startTime) / 1000;				
	}
	
	//밀리세컨드의 시작시간 메서드
	public void start() {
		startTime = System.currentTimeMillis();
	}
	//밀리세컨드의 끝시간 메서드
	public void stop() {
		endTime = System.currentTimeMillis();
	}

}
