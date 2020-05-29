package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class DaumScaneDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.daum.net/");
		InputStream in = url.openStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;

		
		FileWriter fw = new FileWriter("c:\\dev\\daumm.html");
		
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw,true);

		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
			//fw.write(readLine+"\n"); //BufferedWriter을 쓰지않고 이렇게 만 써줘도 됨.
			//bw.write(readLine); //BufferedWriter을 쓸 경우 사용
			//bw.newLine(); //BufferedWriter을 쓸 경우 사용
			pw.println(readLine);//PrinterWriter을 쓸 경우 사용
		}
		//bw.flush(); //BufferedWriter을 쓸 경우 사용
		
		
		
		
		
	}

}
