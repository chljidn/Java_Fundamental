package java_20200513;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum +=i;
		}
		System.out.printf("1부터 10까지 합은 %d입니다.%n",sum);//%n은 개행시키는 것으로, %n이 없으면 일렬로 주욱 나오게 됨. %d에는 sum이 들어감.
		System.out.println("1부터 10까지 합은 "+sum+"입니다.");
		
		
		int sum1 = 0;
		for (int i = 1; i <= 10; i++) { // i++가 아닌 i+=2로 하면 2씩 증가.
			if(i%2==0) {
				sum1+=i;
			}
			System.out.println(sum);
		}
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d%n", i,j,i*j);//%d에는 i, j, i*j가 들어감.
			}
			
		}
		
		//9, 8, 7,,, 2단 까지
		for (int i = 9; i >= 2 ; i--) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d%n", i,j,i*j);
				
			}
			
		}
		
		
		/*
		 * 
		 ** 
		 ***
		 ****
		 ***** 
		 */
		for ( int i = 1; i <= 5 ; i++) {
			for (int j = 1; j < i+1; j++) {
			
			System.out.print("*");			
			}
			System.out.println();
		}
		
		
		/*
		 ***** 
		 **** 
		 ***
		 **
		 *
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 6; j > i+1; j--) { //i+1을 5-i로 바꿔주어도 됨. 이때는 j = 0, j++로 해야 함.
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*
		      *
		     **
		    ***
		   ****
		  *****
		 */
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				if (j<i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();				
		}
		
		
		/*
		 *****
		  ****
		   ***
		    **
		     *
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i>j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
			
		}
		
		
		/*
		     *    
		    ***
		   *****		   
		 */
		for (int i = 1; i <= 3; i++) {
			for (int j = 0; j<i+2; j++) {
				if (i+j<3) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		/*
		      * 
		     *** 
		    *****
		   *******
		  ********* 
		 */
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j<i+5; j++) {
				if (i+j<=5) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}				
				
			}
			System.out.println();
			
		}
	}
}


