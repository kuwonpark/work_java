package ch06;

public class Person {
	
	 	// 속성(인스턴스 변수)
	 	// 1. 이름
	 	// 2. 나이
	 	// 3. 주소
	 	String name;
	 	int age;
	 	String address;
	 	
		// [2-1] 이름, 나이, 주소 인스턴스 변수를 초기화하는 생성자를 작성하시오.
	 	Person(String n, int g, String a){//파라메터변수
	 	
	 		name = n;
		 	age = g;
		 	address = a;
	 	}
	 	
	 	//이름만 받는 생성자 작성 나이랑 주소는 19 없을으로 초기화
	 	Person(String name){
	 		/*name = na;
	 		age = 19;
	 		address = "없음";*/
	 		this(name,19,"없음");
	 		System.out.println("생성자 호출!");
	 		
	 	}
		
	 	// 행동(메서드)
	 	// 1. 자기소개
	 	// "저는 [나이]살 [주소]에 사는 [이름]입니다."
	 	void introduce() {
	 		System.out.println("저는 " + age + "살 " + address + "에 사는 " + name + "입니다.");
	 	}

}
