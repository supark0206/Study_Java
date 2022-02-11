package ch13;

public class ThreadEx02 {
	static long startTime = 0;

	public static void main(String[] args) {
		ThreadEx02_1 t1 = new ThreadEx02_1();
		ThreadEx02_2 t2 = new ThreadEx02_2();

		t1.start();
		t2.start();
		startTime = System.currentTimeMillis();
		
		try {
			t1.join(); //main쓰레드가 t1의 작업이 끝날때 까지 기다린다
 			t2.join();
		}catch(InterruptedException e) {}
		
		System.out.println("소요시간 : "+ (System.currentTimeMillis() - startTime));
	}

}

class ThreadEx02_1 extends Thread{
	public void run() {
		for(int i =0; i<300;i++) {
			System.out.print(new String("-"));
		}
	}
}

class ThreadEx02_2 extends Thread{
	public void run() {
		for(int i =0; i<300;i++) {
			System.out.print(new String("|"));
		}
	}
}