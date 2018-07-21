package ch07;

class Tv{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv{//위 인스턴스와 변수를 캡션티비가 상속을 받음
	boolean caption;
	void displayCaption(String text) {
		if(caption) { //캡션 상태가 트루일떄만 text를 보여준다
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
		
	}

}
