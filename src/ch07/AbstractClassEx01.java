package ch07;

public class AbstractClassEx01 {

	public static void main(String[] args) {
		// 다형성을 이용한다.
		Unit[] group = {new Marine(),new Tank(),new Dropship()};
		
		for(int i = 0;i<group.length;i++)
			group[i].move(100, 200);
	}

}

abstract class Unit{//추상메서드
	
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("유닛멈춤");}
	
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("마린 x="+x+"y="+y );
	}
	void stimPack() {System.out.println("스팀팩사용");}
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("탱크 x="+x+"y="+y );
	}
	void attackMode() {
		System.out.println("공격모드로 전환");
	}
	
}
class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("드랍쉽 x="+x+"y="+y );
	}
	void attackMode() {
		System.out.println("공중이동");
	}
	
}