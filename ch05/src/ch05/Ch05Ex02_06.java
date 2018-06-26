package ch05;

import java.util.Scanner;

public class Ch05Ex02_06 {
	public static void main(String[] args) {
		char [] alap = {'A','P','P','L','E','!'};
		Scanner scanner = new Scanner(System.in);
		char a = scanner.nextLine().charAt(0);
		
		//입력받은 문자와 일치하는 문자가 a 에 속해있다면
		//변수값은 true 아니면 false
		boolean isFind = false;
		
		for(int i = 0; i < alap.length; i++) {
			//입력한 문자와 배열에 있는 문자가 일치할 경우
			if(a == alap[i]) {
				//일치하는 문자가 있다는 표시로  isFind값을 true로 변경
				isFind = true;
				//이때의 인덱스 번호 출력
				System.out.print(i+" ");
				
			}
		}
		//일치하지 않을경우 none
		if(isFind == false) {
			System.out.println("none");
			
		}
	}

}
