package ch05;

public class ch05Ex01_02 {
	public static void main(String[] args) {
		int []score = new int[10]; 
		
		for(int i = 0; i < score.length; i++) {
			score[i] = i+1;
			System.out.printf("%3d",score[i]);
		}
	}

}
