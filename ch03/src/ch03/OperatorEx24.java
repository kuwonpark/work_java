package ch03;

public class OperatorEx24 {
	public static void main(String[] args) {
		int x = 0;
		char ch = ' ';
		
		x = 15;// 값이 10초과이고 20미만인지 확인
		System.out.printf("x=%2d, 10 < x && x < 20 = %b%n", x, 10 < x && x < 20);
		x = 6;
		// 나머지 연산자와 or를 사용해서 true를 얻어냄 or는 좌변이 참일경우 우변을 계산하지 않고 true값을 리턴
		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6!= 0 =%b%n",
				x,x % 2 == 0 || x % 3 == 0 && x % 6 != 0);
		//and 연사자를 사용  and는 좌변이 false일 경우 우변을 계산하지 않고 false값을 리턴
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!= 0 =%b%n",
				x,(x % 2 == 0 || x % 3 == 3) && x % 6 != 0);
		ch = '1'; //변수 ch가 문자 '0' 이상 문자 '9'이하인지 확인
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b%n",ch, '0'<= ch && ch <= '9');
		ch = 'a';// 'a'이상 'z'이하 인지 확인 
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b%n",ch, 'a'<= ch && ch <= 'z');
		ch = 'A';// 위와 동일
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z =%b%n",ch, 'A'<= ch && ch <= 'Z');
		ch = 'q';// 변수 문자'q'거나 'Q'면 ture
		System.out.printf("ch='%c', ch=='q' || ch=='Q'%b%n", ch, ch=='q' || ch=='Q');
	}

}
