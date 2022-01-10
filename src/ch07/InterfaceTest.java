package ch07;

abstract class Unit02{
	int x,y;
	abstract void move(int x ,int y);
}
interface Fightable{
	void move(int x,int y); //public abstract 생략됨
	void attack(Fightable f); //public abstract 생략됨
}
class Fighter extends Unit02 implements Fightable{
	//public 꼭 서주기
	//오버라이딩 규칙 : 조상보다 접근제어자가 좁으면 안된다.
	@Override
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}

	@Override
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이동");
		
	}
}

public class InterfaceTest{

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		f.move(100, 200);
		f.attack(new Fighter());
	}

}
