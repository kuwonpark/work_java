package ch04;

public class Flow22 {
	public static void main(String[] args) {
		
		//c 언어 사용자를 위한 배열 선언 및 초기화 코드
		int []arr = {10,20,30,40,50};
		int sum = 0;
		
		//for문
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		/*
		 * 향상된 for 문 
		 * 형태 for (타입 변수명 : 배열 또는 컬렉션)
	
		 */
		
		for (int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum="+ sum);
	}

}
