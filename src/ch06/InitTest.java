package ch06;

public class InitTest {

	//명시적 초기화
	static int cv = 1;
	int iv = 1;

	static {cv = 2;}//클래스 초기화 블럭
	{iv = 2;} //인스턴스 초기화 블럭
	
	//생성자를 통한 초기화
	InitTest(){
		iv=3;
	}
}
