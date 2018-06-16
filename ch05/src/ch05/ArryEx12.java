package ch05;

public class ArryEx12 {
	public static void main(String[] args) {
		String[] names = {"Kim","Park", "Yi"};
		
		for(int i=0; i < names.length; i++) {
			System.out.println("names["+i+"]:" + names[i]);
		}
		
		String tmp = names[2]; // 배열 names의 세번째 요소를 tmp에 저장
		System.out.println("tmp:"+ tmp);
		
		names[0] = "Yu"; // 배열 첫번쨰 요소를Yu로 변경
		
		for(String str : names) {// 향상된 for 문 모든 값을 출력해준다
			System.out.println(str);
		}
	}

}
