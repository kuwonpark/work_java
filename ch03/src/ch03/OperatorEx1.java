package ch03;

public class OperatorEx1 {
	public static void main(String[] args) {
		int i = 5;
		i++;                   // i= i +1; 과 같은 의미이다 ++i;로 바꿔써도 결과는 동일
		System.out.println(i);
		
		i = 5;  // 결과를 비교하기 위해 i값을 다시 5로 변ㄱㅇ
		++i;
		System.out.println(i);
		
		/*
		 * i++는 변수 i를 사용하고 1증가
		 * ++i는 먼저 1증가하고 변수 i를 사용
		 */
		i=5;
		System.out.println(i++);// 사용하고 1증가이기 때문에 5출력 i=6
		
		i=5;
		System.out.println(++i);// 1증가하고 사용하기때문에 6출력 i=6
	}
}