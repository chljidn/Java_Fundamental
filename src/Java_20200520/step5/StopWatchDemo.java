package Java_20200520.step5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StopWatchDemo {
	
	public static void run(StopWatch s1) {
		s1.execute();
	}
	public static void main(String[] args) throws Exception {
		//StopNanoWatch s1 = new StopNanoWatch();
		//StopMilliWatch s1 = new StopMilliWatch();
		//StopMicroWatch s1 = new StopMicroWatch();
		//run(s1);
		
		//Java IO 19-22
		BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\workspace\\Java_Fundamental\\src\\Java_20200520\\step5\\class.txt"));
		
		String readline = br.readLine();
		
		
		//Java Reflection 24-25
		Class clazz = Class.forName(readline);
		StopWatch s = (StopWatch)clazz.newInstance();
		run(s);
		
		
	}	

}

