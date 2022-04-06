package array;

public class Arr01 {
	public static void main(String[] args) {

		// 배열: 같은 타입의 여러 값을 하나의 묶음으로 다루는 효율적인 방법
		// 정수 1000개의 값을 변수에 저장: int n1, n2, n3..... n1000;
		// n1=1; n2=2;

		// 정수 배열로 처리 - 저장, 전송, 출력이 모두 간편해짐

		// 정수 배열 선언
		int[] n1; // int n1[]; - int 배열 n1 선언 - 초기화 안 됨.
		// System.out.println(n1);
		n1 = new int[1000]; // 정수 저장공간 1000개가 만들어지고 0으로 초기화
		System.out.println(n1); // [I@15db9742 - 배열 변수가 참조하는 메모리 주소
		System.out.println(n1[0]);

		// float 배열 50칸 선언 및 생성
		float[] f1;
		f1 = new float[50];
		float[] f2= new float[50];
		System.out.println(f1[0]); //float 배열의 초기값은 0.0
		
		//boolean 배열 10칸 선언 및 생성
		boolean[] b1 = new boolean[10];
		System.out.println(b1[0]);  //false로 자동 초기화
		
		//char 배열 5칸
		char[] c1 = new char[5];
		System.out.println(c1[1]); // ' '로 초기화
		
		String[] s1 = new String[5];
		System.out.println(s1[0]); //null로 초기화
		s1[1] = "happy";
		System.out.println(s1[1]);
		s1[2] = "happy";
		System.out.println(s1[2]);
		System.out.println(s1[1] == s1[2]);

		s1[3] = new String("happy");
		System.out.println(s1[3]);
		System.out.println(s1[1] == s1[3]);
		System.out.println(s1[1].equals(s1[3]));

		
	}
}
