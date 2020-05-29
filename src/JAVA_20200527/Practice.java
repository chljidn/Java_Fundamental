package JAVA_20200527;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Practice {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://gdimg.gmarket.co.kr/1803177701/still/300");
		
		InputStream in = url.openStream();
		FileOutputStream fis = new FileOutputStream("c:\\dev\\300.jpg");
		
		byte[] readBytes = new byte[1024*8];
		int readByteCount = 0;
		while((readByteCount = in.read(readBytes)) != -1) {
			fis.write(readBytes,0,readByteCount);
		}
		
		in.close();
		fis.close();
		
	}
	
	

}
