package test02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[]args) {
		List<Integer> Lottos = new ArrayList<Integer>();
		for(int i=1; i<=6; i++) {
			int Lotto = (int)(Math.random()*45)+1;
			if(Lottos.indexOf(Lotto)!=-1) {
				i--;
				continue;
			}
			Lottos.add(Lotto);
		}
		
		for(int i=0; i<Lottos.size(); i++) {
			System.out.println(i+1+"번쨰 번호 : "+Lottos.get(i));
		}
	}

}
