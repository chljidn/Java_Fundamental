package Java_20200520.step4;

public class StopWatchDemo {
	public static void run(StopMilliWatch s1) { //지역변수 객체 s1은 StopMilliWatch클래스를 참조한다?
		s1.execute();
	}
	
	public static void run(StopNanoWatch s1) {
		s1.execute();
	}

	
	public static void main(String[] args) {
		//StopNanoWatch s1 = new StopNanoWatch();
		StopMilliWatch s1 = new StopMilliWatch();
		run(s1);
	}	

}

