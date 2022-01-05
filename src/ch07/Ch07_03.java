package ch07;

public class Ch07_03 {
	//포함 관계 확인하기
	public static void main(String[] args) {
		Circle_1 v = new Circle_1();
		System.out.println("circle1의 x값" + v.x);
		System.out.println("circle1의 y값" + v.y);
		
		Circle_2 c = new Circle_2();
		System.out.println("circle2의 x값" + c.p.x);
		System.out.println("circle2의 y값" + c.p.y);
	}

}
class Circle_1{
	int x = 1;
	int y = 2;
	int r = 3;
}
class Circle_2{
	//포함관계를 사용해서 위와 동일한 코드
	Point p = new Point(); //객체를 사용해준다
	int r = 10;
}

class Point {
	int x = 7;
	int y = 7;
}
