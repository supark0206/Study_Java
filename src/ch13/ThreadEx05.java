package ch13;

public class ThreadEx05{

	public static void main(String[] args) {

		ThreadEx05_1 t1 = new ThreadEx05_1();
		ThreadEx05_2 t2 = new ThreadEx05_2();
		
		t1.start();
		t2.start();
		
		delay(2*1000);
		System.out.println("<<main 종료>>");
		
	}
	// 매번 try catch 하기 번거롭기 때문에 
	// sleep을 사용할때 다른 메소드를 생성해서 사용
	static void delay(long millis) {
		try {
			Thread.sleep(millis);//작성한 쓰레드만 잘수있음
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}

class ThreadEx05_1 extends Thread{
	public void run() {
		for(int i =0; i <300;i++) {
			System.out.println("-");
		}
		System.out.println("-<<th1종료>>-");
	}
}


class ThreadEx05_2 extends Thread{
	public void run() {
		for(int i =0; i <300;i++) {
			System.out.println("|");
		}
		System.out.println("-<<th2종료>>-");
	}
}