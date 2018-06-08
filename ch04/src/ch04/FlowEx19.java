package ch04;

public class FlowEx19 {
	public static void main(String[] args) {
		/*
		 * for 문에 중괄호를 쓰지 않으면 for문 다음 첫번째 줄을 for 몸체로 이닉
		 * 몸체부분을 더명확하게 하기 위햇 중괄흘 쓰자
		 */
		for(int i = 1; i<=3; i++)
			for(int j = 1; j<=3; j++)
			 for(int k = 1; k<=3; k++)
				 System.out.println(""+i+j+k);
	}

}
