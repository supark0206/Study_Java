package ch13;

public class ThreadEx07{

	public static void main(String[] args) {

		ThreadEx07_1 th1 = new ThreadEx07_1("*");
		ThreadEx07_1 th2 = new ThreadEx07_1("**");
		ThreadEx07_1 th3 = new ThreadEx07_1("***");

		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();//쓰레드 th1을 잠시 중단
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();//쓰레드 th1 다시 동작
			Thread.sleep(3000);
			th1.stop();//강제종료
			th2.stop();
			Thread.sleep(3000);
			th3.stop();
	
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}

class ThreadEx07_1 implements Runnable{
	
	// deprecated 이기때문에 직접 메소드를 생성해서 사용
	boolean suspended = false;
	boolean stopped = false;
	
	Thread th;
	public ThreadEx07_1(String name) {
		th = new Thread(this,name);
	}
	void start() {
		th.start();
	}
	void stop() {
		stopped = true;
	}
	void suspend() {
		suspended = true;
	}
	void resume() {
		suspended = false;
	}
	
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
			}
			
		}
	}
}
