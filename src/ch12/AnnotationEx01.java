package ch12;

public class AnnotationEx01 {

	public static void main(String[] args) {

		
	}

}

@FunctionalInterface
interface Testable{
	//추상메서드 2개면 에러가 남ㅇ
	void test();
	//void check();
}

//@Override
class anoEx{
	
	@Deprecated
	void depreEx() {};
	
}
