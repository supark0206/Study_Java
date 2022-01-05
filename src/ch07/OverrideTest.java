package ch07;


class Point3{
	int x;
	int y;
	String getLocation() {
		return "x : " + x +", y :" +y;
	}
}

class Point3D extends Point3{
	int z;
	
	//조상의 getLocation()을 오버라이딩
	String getLocation(){
		return "x : " + x +", y :" +y+", z :" +z;
		
	}
}	
public class OverrideTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D();
		System.out.println(p.getLocation());
	}

}
