package ch13;

public class ThreadEx03 {

	public static void main(String[] args) {
		ThreadEx03_1 th1 = new ThreadEx03_1();
		ThreadEx03_2 th2 = new ThreadEx03_2();
		
		//th1 은 기본적으로 우선순위가 5이다 기본값이 5임
		th2.setPriority(7);
		
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
	
		th1.start();
		th2.start();
	}

}

class ThreadEx03_1 extends Thread{
	public void run() {
		for(int i = 0; i <300; i++) {
			System.out.println("-");
			for(int x = 0 ; x<10000000;x++); // 시간 지연용 for문
		}
	}
}
class ThreadEx03_2 extends Thread{
	public void run() {
		for(int i =0;i<300;i++) {
			System.out.println("|");
			for(int x = 0 ; x<10000000;x++);
		}
	}
}