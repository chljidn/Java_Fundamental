package Java_20200525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
	
	public static void main(String[] args) {
		FileInputStream fis = null; //InputStream클래스의 하위 클래스인 FileInputStream클래스 객체를 설정하기 전에 같은 타입의 참조변수설정.
		FileOutputStream fos = null;//InputStream클래스의 하위 클래스인 FileOutputStream클래스 객체를 생성하기 전에 같은 타입의 참조변수 설정.
		
		//FileInputStream 클래스와 FileOutputStream 클래스는 FileNotfoundException을 throw했기 때문에
		//사용하기 위해서 무조건 이렇게 예외처리를 해주어야 함.
		try {
			fis = new FileInputStream("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe"); //객체 생성(읽을 대상)
			fos = new FileOutputStream("c:\\dev\\jdk.exe"); //객체생성(출력 대상)
			
			//이 세 줄은 꼭 외울 것. - 1바이트씩 읽어서 1바이트씩 출력(1바이트씩 읽고 출력하고 읽고 출력하고 읽고 출력하고 반복)
			int readByte = 0;
			//fis.read() : 한 바이트 읽어 반환한다. 더 이상 읽을 바이트가 없으면 -1을 반환한다.
			while((readByte = fis.read()) != -1) { //-1이 아니라는 것은 읽을 바이트가 있다는 뜻.
				//fos.write(~) : 한 바이트 쓰기
				fos.write(readByte); 
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//FileInputStream과 FileOutputStream의 상위 클래스인 InputStream과 OutputStream클래스가 Ioexception을 throw했기 때문에
			//fis.read()와 fos.write()할 때 예외가 발생하고, Io.Exception예외처리가 필요하기 때문에
			//여기서 그에 대한 예외처리를 해줌.
				try {
					if(fis != null) fis.close();
					if(fos != null) fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

}
