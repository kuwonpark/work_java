package ch05;

public class ArryEx18 {
	public static void main(String[] args) {
		
		int[][]score= { 
				{100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
		};
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) { // i는 배열의 수 ex {} {} {} {}
			for(int j = 0; j <score[i].length; j++) { // j 는 배열 안의 값 ex 100,20,30,40
				System.out.printf("score[%d][%d]=%d%n", i,j,score[i][j]);
			}
		}
		for(int[]tmp : score) { // 향상된 for 문으로 모든 배열을 가져온다
			for(int i : tmp ) {
				sum += i;
			}
		}
		System.out.println("sum = "+sum);
	}

	
}
