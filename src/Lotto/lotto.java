package Lotto;
import java.util.Scanner;

public class lotto {
	static int game1;
	static int game;
	static int lottoNum = 6;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임 수를 입력하시오: ");
		game = sc.nextInt();

		
		int[] lotto = new int[lottoNum];
		int[][] predict = new int [game][lottoNum];
		
		
		for (int i = 0; i < game; i++) {
			System.out.print(i+"번째 게임. 번호를 입력하시오 : ");
			for (int j = 0; j < lottoNum; j++) {
				predict[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < game; i++) {
			System.out.println();
			System.out.print(i+"번째 게임 번호: ");
			for (int j = 0; j < lottoNum; j++) {
				System.out.print(predict[i][j] + " ");
			}
		}
		/*
		//로또번호 생성
		for(int i = 0; i<lotto.length; i++) {
			int random = (int)(Math.random()*45+1);
			boolean isExisted = false;
			for (int j = 0; j < i; j++) {
				if (i==(i-1)) {
					isExisted = true;
					break;
				}
				
				
			}
			if(isExisted == true) {
				i--;
			}else {
				lotto[i] = random;
			}
		
		}
		for(int value : lotto) {
			System.out.print(value+"\t");
		}
		*/
		
		
		
		
		
		
		
		
	}

}
