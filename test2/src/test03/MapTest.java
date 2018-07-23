package test03;

import java.util.ArrayList;
import java.util.LinkedHashMap;



public class MapTest {
	
	public static void main(String[]args) {
		LinkedHashMap<String,String> personInfo=    //Hashmap은 key value가 있음
				new LinkedHashMap<String,String>(); //HashMap은 방의 순서가 지정되있지 않음으로 원하는 순서대로 출력하려면
													//Linked를 건다 
		personInfo.put("이름","홍길동");
		personInfo.put("나이","33");
		personInfo.put("주소","서울");
		
		System.out.println(personInfo);
		String age = personInfo.get("나이");
		System.out.println("personInfo의 나이 : "+age);
		
		ArrayList<String> al = new ArrayList<String>();
	}

}
