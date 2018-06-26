package ch05;

import java.util.Scanner;

public class Ch05Ex02_04 {
	public static void main(String[] args) {
		//초기에는 2칸짜리 배열을 우선 생성
		int[] a = new int [2];

		// 입력을 받을 값을 저장할 인덱스 번호
		int i = 0;

		//무한 반복
		while(true) {
			Scanner scanner = new Scanner(System.in);
			String b = scanner.nextLine();

			//배열이 꽉찼을때
			if(i==a.length) {
				//임시로 a배열의 크기를 2배크기인 배열 tmp를 생성
				int[]tmp = new int[a.length*2];
				//a배열에 담겨있는 배열 값을 tmp에 벅시
				System.arraycopy(a,0,tmp,0,a.length);
				//tmp 사용할 것으로 a를 tmp배열에 대입
				a =tmp;
			}

			a[i] = Integer.parseInt(b);

			if(a[i]==-1) {
				break;
			}
			// a 배열의 다음 ㅇ칸으로 가리키기 위해 인덱스 번호 증가
			i++;

		}
		// a배열탐색
		for(int j = 0; j<a.length; j++) {
			// -1이 발견되면
			if(a[j]==-1) {
				//인덱스값이 3 미만이면 현재 인덱스 번호를 사용하고
				//3이상이면 현재 인덱스 벊 에서 앞으로 3칸의 값부터사용
				int init = j<3? j:3;

				//-1을 제외한 마지막 세개의 정수를 출력
				for(int k = init; k>=1; k-- ) {
					System.out.print(a[j-k]+" ");
				}
				break;
			}
		}
	}

}
