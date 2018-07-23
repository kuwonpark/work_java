package test03;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exec {
	
	public static void main(String[]args) {
		 // set 값을 대입
		 // get 값을 불러온다
		ArrayList<Person> pList = new ArrayList<Person>(); 
		
		
		/*Person p = new Person();//Person에 생성된것들은 p 에 저장가능
		System.out.println(p.getName());
		p.setName("홍길동");
		pList.add(p); //새로운 Person을 만들어라
		p = new Person();
		p.setName("홍길동");
		System.out.println(pList.get(0).getName());//pList에있는 0번째 방을 호출.*/
		
		
			//이름은 테스트1~5
			//나이 10~50
			//포인트 자유
		
		 for(int i=0; i<5; i++) {
			String name = "테스트"+(i+1);
			int age = (i+1)*10;
			Person p = new Person();
			p.setName(name);
			p.setAge(age);
			pList.add(p);
		
		}
		 
		 for(int i=0; i<5; i++) {
			 Person p = pList.get(i);
		 System.out.println(p.getName()+","+p.getAge());
	}
	}
}
