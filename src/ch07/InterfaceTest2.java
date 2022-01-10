package ch07;

class A{
	//public void method(B b) 이렇게하면 c로 바꿀때 또 c로 바꿔줘야됨
	public void method(I i) {//매개변수를 interface로 해줌
		i.method();
	}
}

//클래스의 선언과 구현을 분리
interface I {
	public void method();
}

class B implements I{
	public void method() {
		System.out.println("B클래스의 메소드");
	}
}

class C implements I{
	public void method() {
		System.out.println("C클래스의 메소드");
	}
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		A a = new A();
		a.method(new C());  //A가 b를 사용(A가 b에 의존)
		
	}

}
