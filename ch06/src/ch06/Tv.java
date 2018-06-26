package ch06;

 class Tv {
	
		String color; // 색상
		boolean power;  // 전원
		int channel; // 채널
		
		void power () {power = !power;} 
		//void 는 리턴 타입 ()parameter 자리
		//{ex : a=b  (return;)} 는 body return은 생략가능
		
		void channelUp() {++channel;}
		void channelDown() {--channel;}
}
	


