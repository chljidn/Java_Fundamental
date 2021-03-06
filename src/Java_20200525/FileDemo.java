package Java_20200525;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class FileDemo {
	public static void main(String[] args) {
		//File 클래스
		//1. 디렉토리 생성*
		//2. 파일 크기*
		//3. 파일 이름
		//4. 파일 경로
		//5. 파일 날짜
		//6. 파일 생성
		//7. 파일 삭제*
		//8. 파일 이름 바꾸기*
		

		//dev안에 2020폴더를 만들고, 2020폴더 안에 05폴더 만들고, 05폴더안에 25폴더 만들기(디렉토리 생성).
		File f1 = new File("c:\\dev\\2020\\05\\25");
		boolean success = f1.mkdirs();
		if(success) {
			System.out.println("디렉토리를 생성했습니다.");
		}else {
			System.out.println("이미 디렉토리가 있습니다.");
		}
		
	
		File f2 = new File("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
		//파일의 사이즈 가져오기.
		long filesize = f2.length()/1024;
		System.out.println(filesize+"KB");
		
		//파일 이름만 가져오기.
		String fileName = f2.getName();
		System.out.println(fileName);
		
		//파일의 전체경로 가져오기.
		String Path = f2.getPath();
		System.out.println(Path);
		
		if(fileName.endsWith("exe")) {
			System.out.println("응용 프로그램");
		}else if(fileName.endsWith("pdf")) {
			System.out.println("pdf 파일");
		}else if(fileName.endsWith("zip")) {
			System.out.println("압축 파일");
		}
		
		
		//1970년 1월 1일부터 마지막 수정한 날짜까지의 시간을 밀리세컨드로 반환
		long lastModified = f2.lastModified();
		System.out.println(lastModified);
		
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(lastModified);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		
		String date = sdf.format(c.getTime());
		System.out.println(date);
		
		
		//dev폴더에 Hello.java파일 생성.
		File f3 = new File("c:\\dev\\Hello.java");
		
		try {
			f3.createNewFile();
		} catch (IOException e) {
		}
		
		//Hello.java파일 삭제.
		//f3.delete();
		
		//파일이름 바꾸기.
		File f4 = new File("c:\\dev\\Helloworld.java");
		f3.renameTo(f4);
		
	}


}
