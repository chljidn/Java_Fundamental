package java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo2 {
	public static void main(String[] args) {
		//이걸 try블럭 안에서 FileInputStream fis = new FileInputStream("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe"); 이런식으로 선언하면
		//끝에서 close로 닫을 수 없기 때문에 미리 선언을 해주는 것. try블럭 안에서 쓰면 try블럭 안에서만 쓸수 있기 때문.
		FileInputStream fis = null; 
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("c:\\dev\\FileDemo.java");
			fos = new FileOutputStream("c:\\dev\\FileDemo2.java");
			
			int readByteCount = 0; //읽은 바이트 갯수 변수
			byte[] readBytes = new byte[1024*8];//읽은 바이트를 배열로 저장하기 위한 변수
			
			//fis.read(readBytes) : FileInputStream에 8192바이트를 읽어서 readBytes에 저장하고 읽은 바이트수를 반환한다. 
			while((readByteCount = fis.read(readBytes)) != -1) { //read()에 매개변수 reatBytes가 없으면 1바이트 읽음. int형이기 때문에 int = 배열 하면 배열크기(바이트 수)가 저장되는듯? 맞나?
				fos.write(readBytes,0,readByteCount);//바이트 배열 readBytes를 0부터 readByteCount만큼 출력한다는 뜻(여기서 readByteCount는 int임)
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(fis != null) fis.close();//스트림이 끝나면 꼭 닫아줘야 함.
					if(fos != null) fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	

}
