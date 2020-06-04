package java_20200604;

import java.util.ArrayList;

public class EmpDemo {
	public static void main(String[] args) {
		//EmpDao dao = EmpDao.getInstance();
		
		EmpDao dao = EmpDao.getInstance();
		
		/*
		//insert
		int no = 9000;
		String name = "LEE";
		String job = "ANALYST";
		int mgr = 7788;
		String hireDate = "2020.06.04";
		int sal = 2200;
		int comm = 0;
		int deptno = 30;
		int resultCount = dao.insert(new EmpDto(no, name, job, mgr,hireDate, sal, comm, deptno));
		if(resultCount == 1) {
			System.out.println("사원이 정상적으로 등록되었습니다.");
		}else {
			System.out.println("오류...");
		}
		*/
		
		/*
		//update
		int no = 9000;
		String name = "LEE1";
		String job = "SALESMAN";
		int mgr = 7844;
		String hireDate = "2020.06.03";
		int sal = 2222;
		int comm = 10;
		int deptno = 10;
		
		int resultCount = dao.update(new EmpDto(no, name, job, mgr, hireDate, sal, comm, deptno));
		if(resultCount == 1) {
			System.out.println("사원이 정상적으로 수정되었습니다.");
		}else {
			System.out.println("오류...");
		}
		*/
		
		/*
		//delete
		int no = 9000;
		
		int resultCount = dao.delete(no);
		if(resultCount == 1) {
			System.out.println("사원이 정상적으로 삭제되었습니다.");
		}else {
			System.out.println("오류...");
		}
		*/
		
		/*
		//select(0, 10);
		int start = 0;
		int len = 10;
		
		ArrayList<EmpDto> list 
		= dao.select(start, len);
		for(EmpDto dto : list) {
			System.out.printf("%d, %s, %s, %d, %s, %d, %d, %d %n" , dto.getNo(), dto.getName(), dto.getJob(), 
					dto.getMgr(), dto.getHireDate(), dto.getSal(), dto.getComm(), dto.getDeptNo());
		}
		*/
	
		int no = 7839;
		EmpDto dto = dao.select(no);
		if(dto != null) {
			System.out.printf("%d, %s, %s, %d, %s, %d, %d, %d %n" , dto.getNo(), dto.getName(), dto.getJob(), 
					dto.getMgr(), dto.getHireDate(), dto.getSal(), dto.getComm(), dto.getDeptNo());
		}else {
			System.out.println(no + "회원정보가 없습니다.");
		}
	}


}
