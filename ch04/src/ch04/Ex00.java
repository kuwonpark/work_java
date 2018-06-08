package ch04;

public class Ex00 {
	public static void main(String[] args) {
		int num =10;

		//행의 수만큼 반복
		for(int i = 0; i < num; i++) {
			//열의 수만큼 반북
			for(int j = 0; j< num; j++) {
				//현재 찍을 곳이 빈칸이 아닌경우
				if(j>=num-1-i) {
					System.out.print("*");
				}
				//그 외는 빈칸찍기
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}
}


