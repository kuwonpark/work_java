package ch02;

public class CastingEx2 {
	public static void main(String[] args) {
		//int형 10이  byte타입으로 변경 정보손실x
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n",i,b);
		
		//int 정수 300을  byte 타입으로 변경했을때 정보손실 발생
		//byte의 값의 범위 -128~127을 초과했기 때문
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n",i,b);
		
		//byte 정수 10을 int타입으로 변경했을때 정보손실 ㅇ벗음
		//int 갑은 -20억~20억 이기 때문에 없다
	    b = 10;
	    i = (int)b;
	    System.out.printf("[byte -> int] b=%d -> i=%d%n",b,i);
	    
	    //byte 정수 -2를 int 타입으로 변경 했을때 정보손실 없음
	    //int 갑은 -20억~20억 이기 때문에 없다
        b = -2;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n",b,i);
        
        System.out.println("i="+Integer.toBinaryString(i));
        

	}

}
