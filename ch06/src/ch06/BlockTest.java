package ch06;

public class BlockTest {
	static {//   클래스 초기화 블러
		System.out.println("static{}");
	}
	{// 인스턴스 초기화블럭 생성자 초기화 블럭 이전에 생성되어 출력
		System.out.println("{}");
	}
	public BlockTest() {
		System.out.println("공통코드 1");
		System.out.println("생성자");
	}
	public BlockTest(String a) {
		System.out.println("공통코드 1");
		System.out.println("생성자2");
	}
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTes();");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt = new BlockTes();");
		BlockTest bt2 = new BlockTest();
		
		BlockTest bt3 = new BlockTest();
		BlockTest bt4 = new BlockTest("Hello");
	}

}
