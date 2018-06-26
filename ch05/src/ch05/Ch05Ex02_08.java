package ch05;

import java.util.Scanner;

public class Ch05Ex02_08 {
	public static void main(String[] args) {
		int [] a= new int[2];
		
		int i = 0;
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			if(i == a.length) {
				int []tmp = new int [a.length*2];
				System.arraycopy(a, 0, tmp, 0, a.length);
				a = tmp;
			}
			
			a[i] = num;
			
			if(a[i]==0) {
				break;
			}
			i++;
		}
		
		int m = 0;
		int s = 0;
				
		for(int j =0; j<a.length; j++) {
			if(a[j]==0) {
				break;
			}
			
			if(a[j]%5==0) {
				
				m++;
				
				s+=a[j];
			}
		}
		System.out.println("Multiles of 5 : "+m);
		System.out.println("sum : "+s);
		System.out.printf("avg : %.1f%n ",s/(double)m);
	}

}
