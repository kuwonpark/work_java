package ch05;

public class ArryEx14 {
	public static void main(String[] args) {
		String src = "ABCDE";
		
		for (int i= 0; i < src.length(); i++) { // 문자열에서 문자 하나씩 출력하느 식
			char ch =src.charAt(i); // src 의 i번쨰 문자를 ch에 저장
			System.out.println("src.charAt("+i+"):"+ch);
		
		}
		
		char[] chArr = src.toCharArray(); //String char로 변환
		
		System.out.println(chArr); // char 배열(char[])을 출력
	}

}
