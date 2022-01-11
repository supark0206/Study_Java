package ch07;


public class InnerCls3 {
	private int outerIv = 0;
	private static int outerCv = 0;
	

	class InstanceInner{
		int iiv = outerIv; // 외부 클래스의 private멤버도 접근가능
		int iiv2 = outerCv; // 일반클래스는 static멤버 접근가능
	}
	
	static class StaticInner{
	// 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근 x
	// int siv = outerIv;
	   static int scv = outerCv; // static 끼리라 접근가능
	}
	
	void method() {
		int lv = 0; //지역변수) 값이 바뀌지 않으면 변수는 상수로 간주
		final int Lv = 0; //지역변수)  - 메소드 종료와 함께 소멸
		
		lv = 3 ; // 이렇게 값이 바뀌면 
		
		class LocalInner{  // 지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용가능
			int liv = outerIv;  
			int liv2 = outerCv;  
			
			// 외부클래스의 지역변수는 final이 붙은 변수만 접근가능
			//int liv3 = lv; 
			// 원래는 에러지만 jdk1.8부터 에러아님
			//값이 바뀐적이있으면 에러가난다
			
			int liv4 = Lv; // ok
			
			//왜 상수만 될까? 객체가 더 오래 살아남기위해 외부에서 작업이 먼저끝나버리면
			// 내부 클래스에서 작업이되면 만약 그냥 지역변수면 먼저 종료되면 읽을수가 없다
			//constant pool 덕분에 외부메서드가 종료되도 상수는 사용가능
		}
	}
		
	
}




