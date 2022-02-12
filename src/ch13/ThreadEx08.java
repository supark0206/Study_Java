package ch13;

public class ThreadEx08 {

	static long startTime = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx08_1 th1 = new ThreadEx08_1();
		ThreadEx08_2 th2 = new ThreadEx08_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			th1.join();//메인 쓰레드가 th1의 작업이 끝날 때까지 기다린다
			th2.join();//메인 쓰레드가 th2의 작업이 끝날 때까지 기다린다
		} catch (InterruptedException e) {}
		
		System.out.println("소요시간 :" +(System.currentTimeMillis() - startTime));
	}
}
class ThreadEx08_1 extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print(new String("-"));
		}
	}
}
class ThreadEx08_2 extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print(new String("|"));
		}
	}
}