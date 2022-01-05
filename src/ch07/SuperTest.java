package ch07;

// 모든 생성자는 첫 줄에 다른 생성자를 추가해야된다!
class Num1 {
	int x;
	int y;
	Num1(){} // 기본 생성자는 꼭! 추가하자

	Num1(int x, int y) {
		// 생성자 추가안하면
		// super(); 가 자동추가
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x = " + x + ",y = " + y;
	}
}

class MyNum1 extends Num1 {

	int z;

	MyNum1(int x, int y, int z) {
		super(x, y); //조상멤버를 초기화 이렇게 하는게 맞다
	    /*
		this.x = x
		this.y = y
		이렇게해도 가능하지만 이때는 기본생성자가 꼭있어야된다
		없으면 super()를 컴파일러가 추가하게되는데 
		기본 생성자가없으면 이를 불러올수없어서 에러가난다!
		*/
		this.z = z;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "x = " + x + ",y = " + y + ",z = " + z;
	}
}

public class SuperTest {
	public static void main(String[] args) {
		MyNum1 a = new MyNum1(12, 23, 34);
		System.out.println(a);
	}
}
