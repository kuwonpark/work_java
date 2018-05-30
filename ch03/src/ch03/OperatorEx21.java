package ch03;

public class OperatorEx21 {
	public static void main(String[] args) {
		//같은타입비교
		System.out.printf("10 == 10.0f \t %b%n", 10 == 10.0f);
		
		// 문자 '0'으ㅣ 아스키 코드값인 48과 비교
		System.out.printf("'0' == 0 \t %b%n", '0' == 0);
		
		// 문자 'A'의 아스키 코드값인 65 와 비교
		System.out.printf("'A' == 65 \t %b%n", 'A' == 65);
		
		// 각 문자의 아ㅡ키 코드값과 비교. 65> 66의 결과는 false
		System.out.printf("'A' > 'B' \t %b%n", 'A' > 'B');
		
		//컴파일 단계 에서 'A' +1은 'B'로 치환 
		System.out.printf("'A' != 'B' \t %b%n", 'A' != 'B');
		 // \t는 탭을 의미해서 공백이 생김
	}

}
