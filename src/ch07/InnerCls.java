package ch07;

import ch07.AAA.BBB;

class AAA{//BBB의 외부클래스가 됨
	int i = 100;
	BBB b = new BBB();

	class BBB{// AAA의 내부클래스가 됨
		int bb = 1000;
		final static int CONST = 100;
		void method() {
			//AAA a = new AAA();
			//System.out.println(a.i);
			System.out.println(i); //객체 생성없이 외부클래스의 멤버 접근가능
		}
	}
}

class CCC{
	//BBB b = new BBB(); //AAA의 내부클래스가되서 사용불가능ㄴ
}
/*
 *원래의 경우 
class BBB{
	void method() {
		AAA a = new AAA();
		System.out.println(a.i);
	}
}
*/

public class InnerCls {

	
	public static void main(String[] args) {
		AAA a = new AAA();
		a.b.method();
		System.out.println(BBB.CONST);
		System.out.println(a.b.bb);
	}

}
