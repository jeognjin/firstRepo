package array;

import java.util.Arrays;

public class Arr09 {
	public static void main(String[] args) {
		
		int[] randomArr = new int[10];
		System.out.println(Arrays.toString(randomArr));
		
		for(int i = 0; i< randomArr.length ; i++) {
			System.out.print(randomArr[i]+ ":");
		}
		System.out.println();
		for(int val : randomArr) {
			System.out.print(val+ ":");
		}
		System.out.println();
//		randomArr에 1~10까지의 수를 랜덤하게 섞어서 채우고 싶넹 ㅋㅋㅋ
		//이런, 중복값이 발생했군 ㅋㅋㅋ 어떻게 한당 ㅋㅋㅋ
		for(int i = 0; i < randomArr.length; i++) {
			randomArr[i] = (int)(Math.random()*10) +1; 
		}
		System.out.println(Arrays.toString(randomArr));
		
		for(int i = 0; i < randomArr.length; i++) {
			randomArr[i] = i + 1;
		}
		System.out.println(Arrays.toString(randomArr));
		for(int i = 0; i< 1000; i++) {
			int num = (int)(Math.random()*10);
			int tmp = randomArr[0];
			randomArr[0] = randomArr[num];
			randomArr[num] = tmp;
		}
		System.out.println(Arrays.toString(randomArr));
	}
}
