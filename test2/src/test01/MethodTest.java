package test01;



public class MethodTest {
	String str = "abc";

	//데이터타입 String
	//함수명 test()
	//3개의 동일안 함수명으로 선언과 
	// 호출
	String test() {
		return "abc";
	}
	
	
	
	
	String test(int a) {
		return "1";
		
	}
	String test(double b) {
		return "2";
	}
	
	
	public static void main(String[]args) {
		MethodTest c = new MethodTest();
		System.out.println(c.test());
		System.out.println(c.test(1));
		System.out.println(c.test(1.1));
	}
}
