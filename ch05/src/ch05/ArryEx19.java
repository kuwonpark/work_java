package ch05;

public class ArryEx19 {
	public static void main(String[] args) {
		int[][] score = {
				{100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
				,{50,50,50}
		};
		
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println(" 번호  국어  영어  수학  총점   평균");
		System.out.println("=============================");
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			
			korTotal += score[i][0];
			engTotal += score[i][0];
			mathTotal += score[i][0];
			System.out.printf("%3d", i+1);
			
			for(int j=0; j <score[i].length; j++) { // i 는 {} j 는 {}값
				sum += score[i][j]; // i 는 {} j 는 {}값를 저장함
				System.out.printf("%5d", score[i][j]); // 각각 점수 출력
			}
			
			avg = sum/(float)score[i].length; // 평균값 출력
			System.out.printf("%5d %5.1f%n", sum ,avg); //총점과 평균값을 출력
		}
		System.out.println("=============================");
		System.out.printf("총점: %3d %4d %4d%n", korTotal,engTotal,mathTotal);
	}

}
