package ch03;

public class OperatorEx12 {
	public static void main(String[] args) {
		char c1 = 'a'; // 'a' = 97
		char c2 = c1;
		char c3 = ' '; // c3을 공백으로 초기화
		
		int i = c1 + 1; // 97+1= 98
		
		c3 = (char)(c1 + 1); //c1 +1 > 97 +1 = 98
		c2++;  //98 > b
		c2++; // 99 > c
		
		System.out.println("i="+ i); // 98
		System.out.println("c2="+ c2); // c
		System.out.println("c3="+ c3); // b
		
	}

}
