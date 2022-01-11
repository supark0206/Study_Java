package ch07;


public class InnerCls2 {
	StaticInner st = new StaticInner();
	InstanceInner ins = new InstanceInner();

	class InstanceInner{
		int iv = 100;
		//static int cv = 100; 에러 !
		final static int CONST = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;
	}

	void method() {
		class LocalInner{
			int iv = 300;
			//static int cv =300 ; 에러
			final static int CONST = 300;
		}
	}

	public static void main(String[] args) {
	  //System.out.println(LocalInner.CONST);지역 내부 클래스는 메서드 내에서만 가능
		System.out.println(InstanceInner.CONST);
		//System.out.println(ins.iv); 내부끼리 인스턴스변수 어떻게 쓸까?
		System.out.println(StaticInner.cv);
		//System.out.println(st.iv);
		
	}

}




