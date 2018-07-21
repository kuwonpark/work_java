package test02;

public class ObjectTest2 {
	public int num = 10;
	public String str = "abc";

	public ObjectTest2(int num, String str) {
		this.num = num;
		this.str = str;
		//대입하기위해 씀 this 를써야 위에 값을 상속받아 대입가능
	}

	public String toString() {
		return this.num+","+this.str;
	}
	
	public static void main(String[] args) {
		ObjectTest2 ot1= new ObjectTest2(11,"나나");
		System.out.println(ot1);
		ot1= new ObjectTest2(12,"너너");
		System.out.println(ot1);
		ot1= new ObjectTest2(13,"하하");
		System.out.println(ot1);

	}

}
