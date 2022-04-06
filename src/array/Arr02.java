package array;

public class Arr02 {
	public static void main(String[] args) {

		int a = 10, b = 20, c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("---------");

		// 3칸짜리 정수 배열 선언 및 생성
		int[] arr1 = new int[3];
		// index(0번부터 시작)를 이용해서 배열 값 입력
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println("---------");

		// 3칸짜리 정수 배열의 선언, 생성, 값 입력을 동시에
		int[] arr2 = { 10, 20, 30 };
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		// System.out.println(arr2[3]);//ArrayIndexOutOfBoundsException
		System.out.println("---------");
		// 10칸짜리 정수 배열 선언, 생성
		int[] arr3 = new int[10];
		// 배열의 길이: arr.length로 확인
		System.out.println(arr3.length);// 10 - index: 9까지, 즉 arr.length - 1
		System.out.println("---------");
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = (i + 1) * 100;
		}
		// System.out.println(arr3[7]);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("---------");
		// char 배열 26칸을 만들고 alphabet(A: 65)을 넣으시오.
		// 배열을 출력하시오
		char[] alphabet = new char[26];
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char)(i + 65);
			System.out.printf("alphabet[%d] = %c\n", i, alphabet[i]);
		}
		
		

	}
}
