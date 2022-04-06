package array;

public class Arr04 {
	public static void main(String[] args) {
		
		//메인 메소드의 매개변수 String 배열을 통해 숫자 두 개를 받아서 합계를 출력
		
		String str1 = args[0]; //10
		String str2 = args[1]; //35
		//System.out.println("10" + "35");
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int result = num1 + num2;
		System.out.printf("당신이 입력한 %d와 %d의 합계는 %d입니다.", num1, num2, result);
		
	}
}
