package ch13;

import javax.swing.JOptionPane;

public class ThreadEx06{

	public static void main(String[] args) {
		ThreadEx06_1 th1 = new ThreadEx06_1();
		th1.start();
		//false
		System.out.println("isInterrupted(): "+ th1.isInterrupted());
		String input = JOptionPane.showInputDialog("아무 값이나 입력");
		System.out.println("입력하신 값은"+ input + "입니다");
		th1.interrupt();//interrupt()를 호출하면 interrupted 상태가 true가됨
		//true
		System.out.println("isInterrupted : "+th1.isInterrupted());
		//true
		System.out.println("isInterrupted : "+th1.isInterrupted());
	}

}
class ThreadEx06_1 extends Thread{
	public void run() {
		int i = 10;
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<250000000L;x++); //시간지연
			
		}
		System.out.println("카운트가 종료되었습니다");
	}
}