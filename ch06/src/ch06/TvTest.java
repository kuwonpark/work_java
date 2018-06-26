package ch06;


public class TvTest {
	public static void main(String[] args) {
		
		Tv t;  // Tv인스턴스 참조하기 위한 변수 t 를 선언 , Tv 는 사용자 정의 타입
		 t = new Tv();  // Tv 인스턴스 생성
		 t.channel = 7; 
		 t.channelDown();  // Tv 인스턴스 메서드channelDown() 호출
		 System.out.println("현재 채널은"+t.channel+"입니다.");
	}

}
