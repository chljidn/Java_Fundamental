package java_20200526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		System.out.println("입력하세요>");
		InputStream in = System.in; //표준입력장치와 연결(키보드)
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		
		try {
			//in.read(b) : 키보드 입력 받는걸 기다리고, 키보드 입력중에 enter키를 치면 키보드에 입력한 데이터를 b에 저장한다. 
			/*
			byte[] b = new byte[100];
			int readByteCount = in.read(b);
			String str = new String(b,0,readByteCount);
			System.out.println(str);
			*/
			
			isr = new InputStreamReader(in); //1바이트를 2바이트로 바꿔줌.
			br = new BufferedReader(isr);
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				System.out.println("입력하세요>");
			}
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
