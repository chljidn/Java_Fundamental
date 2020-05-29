package Java_20200518;

public class MethodDemo {
	//8-16라인까지 메서드를 정의
	//boolean 메서드의 반환값
	//instance 메서드(반환값 앞에 아무것도 붙어있지 않은 메서드)
	//int year => 매개변수(parameter)
	public boolean isLeafYear(int year) { //반환값 = boolean, 메서드명 = isLeafYear, int y = 지역변수
		//메서드의 반환값이 boolean이기 때문에 return value의 value도 boolean이어야 한다.
		boolean isLeaf = 
				year%4 == 0 && 
				year%100 != 0 || 
				year%400 == 0;
		return isLeaf;
		
	}
	public long plus(int first, int second) {//반환값 = long, 메서드명 = plus
		return (long)first + (long)second;
	}
	public double divide(int first, int second) {
		return (double)first/(double)second;
	}
	public void println(String message) {
		System.out.println(message);
	}
	public int[] ascending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length -(i+1); j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		MethodDemo m = new MethodDemo(); //새로운 객체 생성 - instance매서드를 사용하기 위함
		boolean test = m.isLeafYear(2000);//아규먼트(Argument)
		if(test) {
			m.println("윤년입니다.");
		}else {
			m.println("윤년이 아닙니다.");
		}
		
		long result = m.plus(10000000, 12312331);
		System.out.println(result); //m.println은 처음 정의할 때 String로 정의하여 문자열만 사용할 수 있으므로 int인 result는 m.println(result);로 사용 불가
		
		double result2 = m.divide(12, 5);
		System.out.println(result2);
		
		int[] temp = {1, 34, 9, 2, 40, 5, 45}; //int[]는 배열을 정렬할 것이기 때문에 이렇게 해줌.
		for(int value : temp) { 
			System.out.println(value +"\t"); //정렬하기 전 출력
		}

		int[] result3 = m.ascending(temp);
		for(int value : result3) {
			System.out.println(value +"\t"); //정렬한 후 출력
			
		}
		
	}
	

	
	
}