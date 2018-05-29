package ch03;

public class OperatorEx13 {
	public static void main(String[] args) {
		char c1 = 'a';
		//char c2 = c1+1; <- 컴파일 에러 에러 발생 이유  'a' 은 컴파일러가 자동으로 먼저 계산 해서
		//b로 코드를 변경해야 실행 가능 하지만
		//c1 +1 에서 변수 c1 은 컴파일 단계에서 어떤 값이 들어올지 모르는 단계에서 실행한 결과 가 int형이라 char에 저장불가
		char c2 = 'a'+1;
				
		System.out.println(c2);
				
	}

	}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
