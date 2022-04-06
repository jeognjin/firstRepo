package array;

public class Arr06 {
	public static void main(String[] args) {
		//정수 2차원 배열 3*3짜리 생성해서 값 넣고 일반 for, 확장 for로 출력
		//출력 끝에서 sum, avg, max, min 출력  
		
		int[][] scores = {{74, 69, 87},{91, 80, 48},{39, 100, 94}};
		
		int sum = 0, max = scores[0][0], min = scores[0][0];
		double avg; 
		int numberOfStudents = 0;
		
		System.out.println("======== 일반 for 문 ==========");
		 for(int i = 0; i < scores.length; i++) {
	         //System.out.println(scores[i]);
			 //numberOfStudents += scores[i].length;
	         for(int j = 0; j < scores[i].length; j++) {
	            System.out.println(scores[i][j]);
	            numberOfStudents++;
	            sum += scores[i][j];
	            if(max < scores[i][j]) {
					max = scores[i][j];
				}
				if(min > scores[i][j]) {
					min = scores[i][j];
				}
	         }
	         System.out.println("------------------");
	      }
		 avg = sum/(double)numberOfStudents;
		 System.out.printf("총점: %d / 평군: %.2f / 최고: %d / 최소: %d\n", sum, avg, max, min);

		 System.out.println("======== 확장 for 문 ==========");
		 numberOfStudents = 0;
			for(int[] row : scores) { //2차원 배열에서 1차원 배열(행)을 하나씩 꺼낸다
//				System.out.println(row);
				for(int val : row) { //꺼낸 행에서 값을 하나씩 꺼낸다
					System.out.println(val);
					numberOfStudents++;
					sum += val;
		            if(max < val) {
						max = val;
					}
					if(min > val) {
						min = val;
					}
					
				}
				System.out.println("------------------");
			}
			System.out.printf("총점: %d / 평군: %.2f / 최고: %d / 최소: %d\n", sum, avg, max, min);
	}
}
