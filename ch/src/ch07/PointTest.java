package ch07;

 class PointTest {
	public static void main(String[] args) {
	
	Point3d p3 = new Point3d(1,2,3);
	String result = p3.getLocation();
	System.out.println(result);
}

}
class Point2 {
	int x,y;
	
	Point2(int x, int y){
		this.x = x;
		this.y= y;
	}
	String getLocation() {
		return "x:"+x+",y:"+y;
	}
}
class Point3d extends Point2{
	int z;
	Point3d(int x, int y, int z){
		super(x,y); // 부모의 기본생성자 호출
		this.z = z;
		
	}
	String getLocation() {
		return "x:"+x+",y:"+y+",z:"+z;
	}
}