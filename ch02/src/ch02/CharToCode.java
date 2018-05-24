package ch02;

public class CharToCode {
	public static void main(String[]args) {
		char ch = 'A'; //'A'값은 유니코드 65
		int code = (int)ch; //ch의 저장된 값을 int타입(정수)로 변환 해주어 65가 나타난다
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code);
		//#x는 16진수로 변환한다. 고로 65를 16진수로 변환하면 41이변한된다.
		char hch = '가';
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
	}

}
