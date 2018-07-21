package ch06;
class Data1{
	int value;
	
	/*
	 * 기본생성자
	 * 생성자를 작성하지 않으면 기본으로
	 * 컴파일러가 없어서 생성하느 생성자
	 * 물론 아래와 같이 명시적으로 작성 후
	 * 바디부분에 코드를 작상하면
	 * 생성자 ㅎ출시 코드가 실행된다
	 */
	Data1(){
		System.out.println("Data1 생성자 호출!");
	}
}
class Data2{
	int value;
	
	Data2(int x){
		value = x;
		System.out.println("Data2 생성자 호출!");
		
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(30);
		
		System.out.println("d1 객체의 value: "+ d1.value );
		System.out.println("d2"
				+ " 객체의 value: "+ d2.value );
	}

}
