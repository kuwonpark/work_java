package ch03;

public class OperatorEx23 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc"); // ==는 메모리 주소비교
		System.out.printf("str1 ==\"abc\" ? %b%n", "str1"=="abc");
		System.out.printf("str2 ==\"abc\" ? %b%n", "str2"=="abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		//equlas는 String에 있는  메소드 str1.equals("abc") 변수 값과 equals 괄호안의 값 비교
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str1.equalsIgnoreCase("ABC"));
		//IgnoreCase대소문자를 구별 안한다는 용어
	}

}
