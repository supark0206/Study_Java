package ch13;

public class ThreadEx01 {

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		// 멀티쓰레드를 이용했기 때문에 엉켜서 출력됨

	}

}

//Thread클래스를 상속
	class ThreadEx1_1 extends Thread{ 
		public void run() {
			for(int i=0; i<5; i++) {
				System.out.println(this.getName()); // 조상인 Thread의 getName을 호출
			}
	
		}
	}

	//Runnable 인터페이스를 구현
	class ThreadEx1_2 implements Runnable{
		public void run() {
			for(int i=0; i<5; i++) {
				//Thread.cuurentThread() - 현재 실행중인 Thread를 반환한다
				System.out.println(Thread.currentThread().getName());
			}
		}
	}
