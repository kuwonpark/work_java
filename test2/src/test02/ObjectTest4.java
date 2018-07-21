package test02;

public class ObjectTest4 {
	private int speed;
	private int power;
	private String heroName;
	
	public ObjectTest4(String name,int power, int speed) {
		this.heroName= name ;
		this.power=power; 
		this.speed=speed;
	}
	
	public String toString() {
		return "내이름은 "+ this.heroName + "이며"+this.power+"정도의 힘과"+this.speed+"정도로 빠르지";
	}
	
	public static void main(String[] args) {
		ObjectTest4[] ot4s = new ObjectTest4[2];
		ot4s[0]= new ObjectTest4("홍길동",1,1);
		ot4s[1]= new ObjectTest4("홍길동",2,2);
		
		for(int i=0; i<ot4s.length; i++) {
			System.out.println(ot4s[i]);
		}
	}

}
