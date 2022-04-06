package array;

import java.util.Arrays;

public class Arr05 {
	// 다차원 배열: 표 - 행과 열로 이루어짐 - 행렬
	public static void main(String[] args) {
		// 3행 3열짜리 2차원배열 선언, 생성
		int[][] num = new int[3][3];

		// 가변형 배열: 1행 2열, 2행 3열 배열 생성
		int[][] num1 = new int[2][];
		num1[0] = new int[2];
		num1[1] = new int[3];

		System.out.println(num1.length); // 행 개수
		System.out.println(num1[0].length); // 1행의 열 개수
		System.out.println(num1[1].length); // 2행의 열 개수

		num1[0][0] = 11;
		num1[0][1] = 22;
		num1[1][0] = 33;
		num1[1][1] = 44;
		num1[1][2] = 55;

		System.out.println(num1); // [[I@15db9742
		System.out.println(Arrays.toString(num1)); // [[I@6d06d69c, [I@7852e922]
		System.out.println(Arrays.toString(num1[0])); // [11, 22]
		System.out.println(Arrays.toString(num1[1])); // [33, 44, 55]
		System.out.println(num1[1][0]); // 33
		System.out.println("------------------");
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
			System.out.println(Arrays.toString(num1[i])); 
			for (int j = 0; j < num1[i].length; j++) {
				System.out.println(num1[i][j]); 
			}
			System.out.println("------------------");
		}
		
		System.out.println("======== 확장 for 문 ==========");
		for(int[] row : num1) { //2차원 배열에서 1차원 배열(행)을 하나씩 꺼낸다
			System.out.println(row);
			for(int val : row) { //꺼낸 행에서 값을 하나씩 꺼낸다
				System.out.println(val);
			}
			System.out.println("------------------");
		}
		

	}
}
