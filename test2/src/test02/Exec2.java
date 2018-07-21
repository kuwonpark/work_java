package test02;

public class Exec2 {
	//don 클래스생성후
	//Action interface 구현하여
	//
	public static void main(String[]args) {
		Action a = new Person("홍길동",1);
		a.run();
		a.walk();
		a.sleep();
		
	    a= new Cat("동동이",4);
		a.run();
		a.walk();
		a.sleep();
		
		Action2 b= new Dog("dododo",1);
		b.die();
		b.sleep();
	}

}
