package Java_20200520.step3;

public class StopNanoWatch {
	//나노세컨드를 관리하기 위한 변수
	long startTime;
	long endTime;
	
	//나노세컨드의 경과시간 메서드
	public double getElapsedNanoTime() {
		return (double)(endTime - startTime) / 1_000_000_000;		
		
	}
	
	//나노세컨드의 시작시간 메서드
	public void startNano() {
		startTime = System.nanoTime();
	}
	//나노세컨드의 끝시간 메서드
	public void stopNano() {
		endTime = System.nanoTime();
	}


}
