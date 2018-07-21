package ch06;

public class InitTest {
	int x; //인스턴스 변수  인스턴스 변수 초기값은 0이다.
	int y=x;
	
	void method1() {
		int i=0; // 지역변수
		int j=i; // 에러 지역번수를 초기화 하지 않고 사용
	}

}
