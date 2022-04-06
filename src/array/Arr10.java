package array;

import java.util.Arrays;

public class Arr10 {
	public static void main(String[] args) {
		
		int[] lot = new int[6];
		
		for(int i =0; i < lot.length; i++) {
			lot[i] = (int)(Math.random()*45)+1;
		}
		System.out.println(Arrays.toString(lot));
		//lotto 배열 45자리 생성 초기화
		int[] lotto = new int[45];
		//1 ~ 45까지의 숫자로 lotto 배열을 채움
		for(int i =0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		//lotto 배열 출력
		System.out.println(Arrays.toString(lotto));
		//tmp: 
		//ran: 
		int tmp, ran;
		
		for(int i = 0; i < 6; i++) {
			//1 ~ 45 사이의 랜덤 수를 추출
			ran = (int)(Math.random()*45)+1;
			//로또 배열의 0번 칸부터 6번 칸까지의 값을 랜덤 수 인덱스 칸의 값과 교환
			tmp = lotto[i];
			lotto[i] = lotto[ran];
			lotto[ran] = tmp;
		}
		System.out.println(Arrays.toString(lotto));
		System.out.println("=== 금주의 로또 번호!!! ===");
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " / ");
		}
		
	}
}
