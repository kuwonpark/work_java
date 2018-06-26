package ch06;

public class Tvtest4 {
	public static void main(String[] args) {
		Tv [] tvArr = new Tv[3];
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; // tvArr[i]의 channel에 i+10저장
		}
		for(int i =0; i<tvArr.length; i++) {
			tvArr[i].channelUp(); // 채널업은 채널++ 이기때문으로 1이증가된다
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}

}
