package java_20200514;

public class LotteryDemo {
	public static void main(String[] args) {
		
		//로또
		//1. 1부터 45까지의 숫자 중 임의 숫자 6개를 생성한다.
		//2. 6개의 숫자 중 중복된 숫자가 나오면 안된다.
		//math.random() => 0보다 크거나 같고 1보다 작은 양수를 double값으로 변환한다. 0.00000 ~ 1.499999
		
		//1~45 임의 랜덤값을 반환.
		//int random = (int)(Math.random()*45)+1;
		//System.out.println(random);
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			int random = (int)(Math.random()*45)+1;
			
			//중복되는 값이 있는지 체크하는 변수
			boolean isExisted = false;
			
			//중복체크하는 코드
			for (int j = 0; j<i; j++) {
				if(lotto[i]==random) {
					isExisted = true;
					break;
				}
			}
			if(!isExisted) { // if(isExisted = false) 와 같음.
				lotto[i] = random;
			} else {
				i--; //i가 앞의 인덱스와 값이 같을 경우 i를 i-1로 감소시켜서 다시 랜덤값을 입력시키기 위함. 
			}
		}
			
		for(int value : lotto) {
			System.out.print(value+"\t");
		}
		
		//역시  git은 좋아!!!
		

	}
	
}
