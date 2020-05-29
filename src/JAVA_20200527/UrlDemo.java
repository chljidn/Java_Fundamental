package JAVA_20200527;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws IOException {

			URL Url = new URL("http://gdimg.gmarket.co.kr/1803177701/still/300");
			String protocol = Url.getProtocol();
			String host = Url.getHost();
			int port = Url.getPort();
			String path = Url.getPath();
			String query = Url.getQuery();
			String reference = Url.getRef();
			
			System.out.println("protocal : "+protocol);
			System.out.println("host : "+host);
			System.out.println("port : "+port); //port는 없으면 -1을 반환함.
			System.out.println("path : "+path);
			System.out.println("query : "+query);
			System.out.println("reference : "+reference);
			
			/*
			InputStream in = Url.openStream();//html 정보 - 1바이트로 InputStream에 불러옴
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
			}
			
			in.close();
			isr.close();
			br.close();
			*/
			
			InputStream in = Url.openStream();//이미지 정보
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
