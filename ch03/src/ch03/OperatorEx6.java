package ch03;

public class OperatorEx6 {
	public static void main(String[] args) {
	byte a = 10;
	byte b = 20;
	// byte c = a+b; // 컴파일 에러가 발생한다 명시적으로 형변환 필요 
	byte c = (byte)(a+b);
			
	System.out.println(c);
	}
/*
 * 자바의 정수 기본형은 int 따라서 계산을 할때는 int로 변경해서 계산
 */
}
