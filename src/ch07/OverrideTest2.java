package ch07;


class MyPoint3D extends Object{
	int x,y,z;
	
	 public MyPoint3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	//Object 클래스의 toStriong 을 오버라이드
	public String toString(){
		return "x : " + x +", y :" +y+", z :" +z;
		
	}
}	
public class OverrideTest2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint3D p = new MyPoint3D(1,2,3);
		System.out.println(p);
	}

}	
