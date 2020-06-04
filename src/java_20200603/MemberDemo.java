package java_20200603;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao mdao = new MemberDao();
		
		int num = 11;
		//String name = "워렌 버핏";
		//String addr = "미국";
		

		/*
		int resultCount = mdao.insert(new MemberDto(num, name, addr));
		if(resultCount == 1) {
			System.out.println("정상적인 회원 가입이 되었습니다.");
		}else {
			System.out.println("오류...");
		}
		*/
		
		/*
		int resultCount = mdao.update(new MemberDto(num, name, addr));
		if(resultCount == 1) {
			System.out.println("회원이 정상적으로 수정되었습니다.");
		}else {
			System.out.println("오류...");			
		}
		*/
		
		/*
		int resultCount = mdao.delete(num);
		if(resultCount == 1) {
			System.out.println("회원이 정상적으로  삭제되었습니다.");
		}else {
			System.out.println("오류...");			
		}
		*/
		
		
		ArrayList<MemberDto> list = mdao.select();
		for(int i = 0; i<list.size();i++) {
			MemberDto m = (MemberDto)list.get(i);
			int _num = m.getNum();
			String name = m.getName();
			String addr = m.getAddr();
			System.out.printf("%d, %s, %s %n",_num,name,addr);
		}
		System.out.println("==============================================================");
		
		
		/*
		MemberDto mdto = mdao.select(num);
		if(mdto != null) {
			int _num = mdto.getNum();
			String name = mdto.getName();
			String addr = mdto.getAddr();
			System.out.printf("%d, %s, %s %n",_num,name,addr);
		}else {
			System.out.println("회원정보가 없습니다.");
		}
		*/
	}


}
