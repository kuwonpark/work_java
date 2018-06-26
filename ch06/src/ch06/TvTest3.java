package ch06;

public class TvTest3 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1 channel의 값은"+t1.channel+"입니다.");
		System.out.println("t2 channel의 값은"+t2.channel+"입니다.");
		
		t2 = t1; // t1값을 t2에 저장
		t1.channel = 7;
		System.out.println("t1 channel의 값을 7로 변경하였습니다");
		
		
		System.out.println("t1 channel의 값은"+t1.channel+"입니다.");
		System.out.println("t2 channel의 값은"+t2.channel+"입니다.");
	}

}
