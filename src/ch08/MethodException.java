package ch08;

public class MethodException {

	//같은 클래스내의 static 멤버이므로 객체생성없이 호출.
	public static void main(String[] args) throws Exception {
		method1();// 마지막 도착
		// 마지막 예외처리 못해서 
		//jvm으로 넘김

	}

	static void method1() throws Exception{
		method2();// 여기로 떠넘김
		// 또 처리못함
		//2.메인으로 떠넘김
	}
	static void method2() throws Exception{
		throw new Exception(); //예외발생
		//예외처리가 없음
		//1.떠넘김
	}
}
