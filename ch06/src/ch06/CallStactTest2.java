package ch06;

public class CallStactTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[] arg)이 시작되었음.");
		firstMethod();
		System.out.println("main(String[] arg)이 끝났음.");
	}
	static void firstMethod(){
		System.out.println("main(String[] arg)이 시작되었음.");
		secondMethod();
		System.out.println("main(String[] arg)이 끝났음.");
	}
	static void secondMethod(){
		System.out.println("main(String[] arg)이 시작되었음.");
		System.out.println("main(String[] arg)이 끝났음.");
	}


}
