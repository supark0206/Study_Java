package ch07;

abstract class Abs02 {// 추상 클래스 (미완성 클래스,미완성 설계도)
	boolean pause; // 일시정지 상태를 저장하기위한 변수
	int currentPos; // 현재 Play되고 있는 위치를 저장하기 위한 변수

	Abs02() { // 추상 클래스도 생성자가 있어야한다.
		pause = false;
		currentPos = 0;
	}

	abstract void play(int pos);// 추상메서드

	abstract void stop(); // 추상메서드

	void play() {
		play(currentPos);
	}
}

// 추상 클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlayer extends Abs02 {
	void play(int pos) {
		// 구현부 넣어줌
	}

	void stop() {
		// 구현부 넣어줌줌
	}
}
public class AbstractEx2 {

	public static void main(String[] args) {
		//AudioPlayer ap = new AudioPlayer();
		
		Abs02 ap = new AudioPlayer(); //다형성으로 인해서 가능
		// 참조변수가 리모컨 , 객체가 기능을 가진 티비
		//실제 객체가 가진 기능이 호출됨
		ap.play(100);
		ap.stop();

	}

}
