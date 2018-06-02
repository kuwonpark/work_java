package ch03;

public class testttt1 {
	public static void main(String[] args) {
		// 프로그램 실행중ㅇ 1번위치 a값이 궁금할 경우
		// 방법 1: print 메소드를 이용해 출력해본다
		// 방법2 : 디버깅 도구를 사용한다.
		int a = 5;
		a += 10;
		//System.out.println(a); // 방법1 : 파괴식 검사
		a = a - 1; //  숫자에 더블클릭 하면 좌측에 점이 찍힘 break point: 중단점 
		//디버깅 실행 해당하는 포인트 줄에 variables에 변수등 값이 나타남 f6을 누르면 다음 줄 실행
		// 디버깅내 단축키 f5메소드 내부 진입 f6 현재 가리키고있는 줄 실행 f7 다음 break point로 이동
		debugTest(a);
	    System.out.printf("%d%n", a);
	}
	private static void debugTest(int b) {
		System.out.println(b+10);
	}

}
