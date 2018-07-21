package test02;

import java.util.ArrayList;

public class WrapperClass {
	
	
	public static void main(String[]args) {
//		int a = 3;
//		Integer in = a;
//		long l = 10;
//		Long lo = l;
//		double d= 1.1;
//		Double dou= d;
//		
//		char c= 'a';
//		Character ch= c;
//		
//		boolean bl = true;
//		Boolean bool = bl;
//		// 소문자 정형화된 데이터 타입 대문자는 정형화되지않은 데이터타입
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("abc");
		al.add("abc");
		al.add("abc");
		al.add("abc");
		for(String str: al) {
			System.out.println(str);
		}
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
	}

}
