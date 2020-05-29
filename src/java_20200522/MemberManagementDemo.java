package java_20200522;


import java.util.ArrayList;
import java.util.Scanner;

public class MemberManagementDemo {
	
	
	private ArrayList<member> list = new ArrayList<member>();
	
	public void print() {
		System.out.println("**********************************************");
		System.out.println("* 1.insert 2.update 3.delete 4.search 5.exit *");
		System.out.println("**********************************************");
	}
	
	public String input(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();//키보드에서 입력한 데이터를 반환
	}
	
	public void run(String inputData) {
		if(inputData.equals("1")) {
			insert();
		}else if(inputData.equals("2")) {
			update();
		}else if(inputData.equals("3")) {
			delete();
		}else if(inputData.equals("4")) {
			search();
		}else if(inputData.equals("5")) {
			System.out.println("프로그램이 종료되었습니다.");
		}else {
			System.out.println("똑바로 해!");
			print();
			String inputD = input("번호를 선택하세요>");
			run(inputD);
		}
	}
	
	//1. 아이디를 입력받는다
	//2. 이름을 입력받는다
	//3. ArrayList에 고객을 추가한다.
	//4. ArrayList에 있는 모든 고객을 출력한다.
	//5. print() 메서드를 호출하여 번호를 선택할 수 있게 한다.
	//6. 번호를 선택하세요> 메세지를 출력한 후 키보드로 입력을 받게 한다.
	public void insert() {
		String id = input("아이디>");
		String name = input("이름>");
		
		member m = new member(id, name); 
		list.add(m);
		
		
		for(member mem : list) {
			System.out.printf("아이디: %s, 이름: %s %n", mem.getId(),mem.getName());
		}
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("---데이터 베이스---");
		print();
		String inputData = input("번호를 선택하세요>");
		run(inputData);
	}
	
	
	
	//----------------------------------------------------------------------------------------
	//1.수정할 아이디를 입력받는다
	//2.ArrayList에 있는 고객정보에서 수정할 아이디를 찾아서 있으면 수정할 이름을 입력받고,
	//  ArrayList에 고객 정보를 수정한다.
	//  만약, 수정할 아이디가 없으면 수정할 아이디가 없습니다. 메세지를 출력한다.
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print() 메서드 호출
	//5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void update() {
		String id = input("본래 아이디>");
		String name = input("이름>");
		String id1 = input("변경할 아이디>");

		
		//입력받은 세 세개의 값을 각각의 변수에 나눠서 넣음. 
		member original = new member(id, name);
		member replace = new member(id1, name);
		
		//수정할 아이디가 없을 경우 "수정할 아이디가 없습니다"문구를 한번만 나타내기 위한 변수.
		int a = 0;
		
		//
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(original.getId()) &&
			   list.get(i).getName().equals(original.getName())) {
				list.set(i, replace);
				a += 1; //

			}else {
				continue;	
			}
		}
		// a > 0 일 경우 변경할 아이디가 있기 때문에 출력하지 않음. 검색된 것이 없을 경우 a == 0이기 때문에 한번만 출력됨. 
		if (a == 0) {
			System.out.println("수정할 아이디가 없습니다.");
		}

		//update 받은 후  리스트 다시 출력하기.
		//출력하기 위해서 member class에서 사용한 setter(setId), getter(getId)를 사용하여 출력한다. 
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("---업데이트 후 데이터 베이스---");
		for(member mem : list) {
			System.out.printf("아이디: %s, 이름: %s %n", mem.getId(),mem.getName()); 
		}
		System.out.println();
		

		//다시 입력받기
		print();
		String inputData = input("번호를 선택하세요>");
		run(inputData);		
	}
	

	//---완성!------------------------------------------------------------------------------------
	//1. 삭제할 아이디를 입력받는다.
	//2. ArrayList의 Member 객체중에서 삭제할 아이디를 찾아 있으면 삭제하고 없으면 "삭제할 아이디가 없습니다."
	//   메세지를 출력한다.
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print() 메서드 호출
	//5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void delete() {
		String id = input("삭제할 아이디> ");
		String name = input("이름> ");
		
		
		//삭제할 아이디와 이름을 member타입 변수에 넣는다
		member del = new member(id, name);
		
		//삭제할 아이디가 없음을 나타낼 때, 한번만 나타나도록 하기 위해서 만든 int형 변수
		int a = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(del.getId()) && 
					(list.get(i).getName().equals(del.getName()))) {
				list.remove(i);
				i--;
				a +=1;
			}else {
				continue;
			}
			
		}
		if (a == 0) {
			System.out.println("삭제할 아이디가 없습니다.");
		}
		
		
		System.out.println();	
		System.out.println("----------------------------------------------------------");
		System.out.println("---삭제 후 데이터 베이스---");
		for(member mem : list) {
			System.out.printf("아이디: %s, 이름: %s %n", mem.getId(),mem.getName());
		}
		System.out.println();
		
		
		print();
		String inputData = input("번호를 선택하세요>");
		run(inputData);			
	}
	
	
	
//---완성!----------------------------------------------------------------------------------------	
	//1. 검색할 아이디를 입력받는다.
	//2. ArrayList에 MemBer 객체 중에서 검색할 아이디를 찾아서 있으면 출력하고 없으면 "검색된 결과가 없습니다." 메세지 출력
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print() 메서드 호출
	//5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	
	public void search() {
		String id = input("검색 아이디> ");
		
		//검색할 아이디를 member 타입 변수 sear에 넣는다.
		member sear = new member(id);
		
		//검색할 아이디가 없음을 나타낼 때, 한번만 나타나도록 하기 위해서 만든 int형 변수
		int a = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(sear.getId())) {
				member strm = list.get(i); //출력하기 위해서 list값을 member 타입 변수 strm에 넣는다
				System.out.printf("아이디: %s, 이름: %s %n", strm.getId(),strm.getName());
				a += 1;
			}else { 
				continue;
			}		
		}
		if (a == 0) {
			System.out.println("검색된 결과가 없습니다.");
		}
		
	
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("---데이터 베이스---");
		for(member mem : list) {
			System.out.printf("아이디: %s, 이름: %s %n", mem.getId(),mem.getName());
		}
		System.out.println();
		
		
		
		print();
		String inputData = input("번호를 선택하세요>");
		run(inputData);
		


		
	}
	
	public static void main(String[] args) {
		MemberManagementDemo m = new MemberManagementDemo();
		m.print();
		String inputData = m.input("번호를 선택하세요");
		m.run(inputData);
	}
}
