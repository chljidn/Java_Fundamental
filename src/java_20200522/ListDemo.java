package java_20200522;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		//ArrayList : 순서가 있고, 객체의 중복을 허용한다.
		ArrayList<String> sss = new ArrayList<String>();
		
		sss.add("최지우"); 
		sss.add("빌게이츠"); 
		sss.add("손정의"); 
		
		for(String value : sss) {
			System.out.println(value);
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//add()메서드는 객체 값을 추가함.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		//get(i)메서드는 객체에서 해당 인덱스의 값을 리턴함.
		
		/*for (int i = 0; i < list.size(); i++) {
			Integer i1 = list.get(i);
			System.out.println(i1);
		}
		System.out.println();
		System.out.println(list.size());
		System.out.println();*/
		
		
		//list 모두 삭제 => remove(int index)
		for (int i = 0; i < list.size();) {
			list.remove(i);
			
		}
		System.out.println(list.size());
	
		
		//enhanced for loop 출력가능(collection중 Generic으로 선언한 경우에만 가능)
		for(Integer value : list) {
			System.out.println(value);
		}
		
		//enhanced for loop는 배열을 출력할 때 사용가능
		int[] temp = {1,2,3,4};
		for(int v : temp) {
			System.out.println(v);
		}
		
		
		
		
		
		
		
	}

}
