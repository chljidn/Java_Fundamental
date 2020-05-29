package java_20200526;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("c:\\dev\\FileDemo.java");
			fw = new FileWriter("c:\\dev\\FileDemo2.java");
			
			/*
			int readChar = 0;
			while((readChar = fr.read()) != -1) { //한문자를 읽어서 한문자 출력...계속 반복 - 한문자씩 읽고 출력, 읽고 출력...
				System.out.write((char)readChar); //모니터로 출력(표준 출력장치 출력)
				//fw.write(readChar); //파일로 출력
			}
			*/
			int readCharCount = 0;
			char[] readChars = new char[1024]; //문자를 배열로 읽어오기 위해서 배열변수 선언
			while((readCharCount = fr.read(readChars)) != -1) { //캐릭터 배열 수만큼 읽어서 1024개의 방에 저장시킨 후, '한꺼번에' 출력.
				System.out.print(new String(readChars,0,readCharCount)); //문자열로 출력
				//fw.write(readChars,0,readCharCount); 
				fw.write(new String(readChars,0,readCharCount)); //FileWriter 클래스의  write() 메서드로 출력.
			}
			
			
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(fr != null) fr.close();
					if(fw != null) fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

}
