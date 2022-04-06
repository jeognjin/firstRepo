package array;

import java.util.Arrays;

public class Arr07 {
	public static void main(String[] args) {
		
		int[] number = {1,2,3,4};
		for(int i =0; i < number.length; i++) {
			System.out.println(number[i]);
			//System.out.println(number[i].);
		}
		System.out.println("---------------------------");
		//4칸 짜리 1차원 String 배열 - String은 오브젝트 - 배열의 각 칸에는 오브젝트를 넣을 수 있구나 ㅋㅋㅋ
		String[] names = {"Atom", "Jane", "Tom", "Sam"};
		
		//Class(특징, 행동) - Object를 찍어내기 위한 틀 
		//Table - row - object - field, method를 가지고 있다(.연산자 이용해서 참조)
		
		System.out.println(names); //[Ljava.lang.String;@15db9742
		System.out.println(Arrays.toString(names)); //[Atom, Jane, Tom, Sam]
		
		for(int i =0; i < names.length; i++) {
			System.out.println(names[i]);
			System.out.println(names[i].charAt(0));
			System.out.println(names[i].length());
		}
		
		System.out.println("---------------------------");
		
		
		
		
		
		
		
	}
}
