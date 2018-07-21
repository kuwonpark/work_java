package test02;

public  class Dog implements Action2 {

	private String name;
	private int age;
	
	public Dog(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public static void pr(Object o) {
		System.out.println(o);
	}
	
	@Override
	public void sleep() {
		pr(this.name+"잡니다.");
		
	}
	@Override
	public void die() {
		pr(this.name+"가 "+this.age+"살에 죽었습니다.");
		
	}
	
}
