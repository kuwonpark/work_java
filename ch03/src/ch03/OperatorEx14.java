package ch03;

public class OperatorEx14 {
	public static void main(String[] args) {
		char c = 'a'; 
		//for문 반복문 
		for (int i=0; i<26; i++){ //대괄호 안에 문장을 26번반복
		System.out.print(c++); //'a'부터 26개 출력
	}
		System.out.println();
		
		c = 'A';
		for(int i = 0; i<26; i++) {
			System.out.print(c++); //'A' 부터 26개출력
		}
		System.out.println();
		
		c = '0';
		for(int i = 0; i<10; i++) {
			System.out.print(c++);// 0 부터 10개출력
		}
		System.out.println();
	}
	
}
