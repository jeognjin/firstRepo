package array;

public class Arr08 {
	public static void main(String[] args) {

		String[] myClass = { "강시온", "권진현", "김가람", "김민선", "김은진", "김이서", "김지택", "김지훈", "박수빈", "송요셉", "신동희", "안민욱", "안병진",
				"윤성훈95", "윤성훈97", "이동조", "이아현", "이왕수", "이정진", "전지윤" };

		for (String name : myClass) {
//			System.out.println(name);
			if (name.charAt(0) == '김') {
				System.out.println(name);
			}
		}

		String[][] teams = { { "송요셉", "김지훈", "윤성훈97", "이동조" }, { "이정진", "김민선", "김이서", "이아현" },
				{ "김가람", "강시온", "박수빈", "김은진" }, { "김지택", "전지윤", "신동희", "이왕수" }, { "안병진", "권진현", "안민욱", "윤성훈95" } };

		int num = 0;
		for (String[] team : teams) {
			num++;
			System.out.println("--------------------");
			System.out.println(num + "팀");
			for (String name : team) {
				System.out.println(name);
			}
		}
	}
}
