package array;

import java.util.Arrays;

public class Arr11 {
	public static void main(String[] args) {
		// 다른 방법: 6칸짜리 정수 배열 생성
		// 1 ~ 45 사이의 random 수를 뽑아서 저장하는데
		// 매번 그때까지 저장된 값들과 비교하여 중복된 값이 있으면 저장하지 않고
		// i값을 1빼서 다시 돌린다.
		
		int[] lotto = new int[6];
		int cnt = 0;
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) +1;
			cnt++;
			for(int j = 0; j < i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(lotto));
		System.out.println(cnt);
	}
}
