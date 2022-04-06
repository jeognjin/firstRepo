package array;

import java.util.Arrays;

public class Arr03 {
	public static void main(String[] args) {
		int[] score = {79, 88, 45, 67, 91, 99, 39, 94, 84, 59, 82, 77};
		
		int sum = 0, max, min;
		double avg;
		
		System.out.println(score); //배열 객체의 메모리 주소 반환 
		System.out.println(score.toString()); //배열 객체의 메모리 주소 반환 
		System.out.println(Arrays.toString(score)); //배열 객체의 내용 반환
		System.out.println("===========================================");
		
		//점수 출력 : 79, 88, 45, 67 ~~~
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + ", ");
		}
		System.out.println("\n===========================================");
		//확장 for
		for(int val : score) {
			System.out.print(val + ", ");
		}
		System.out.println("\n===========================================");
		// 총점
		for(int val : score) {
			sum += val;
		}
		System.out.println("sum: " + sum);
		//평균
		System.out.printf("avg: %.2f \n",  sum/(double)score.length);
		
		//max - min
		max = min = score[0];
		
		for(int i = 1; i < score.length; i++ ) {
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.printf("1등의 점수는 %d점이고 꼴찌의 점수는 %d점입니다.", max, min);
		
		
	}
}
