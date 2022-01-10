package ch07;


abstract class TerranUnit{
	private int hp ;
	private int power;


	public TerranUnit() {}
	
	public abstract void move();
	public abstract void create();
	
	public TerranUnit(int hp, int power) {
		super();
		this.hp = hp;
		this.power = power;
	}

	public void actionTerran() {
		System.out.println("테란병력이다");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	

}

abstract class GroundUnit extends TerranUnit{
	GroundUnit(int hp,int power){
		super(hp,power);
	}
	@Override
	public void move() {
		System.out.println("지상으로 이동한다");	
	}	
}

abstract class AirUnit extends TerranUnit{
	AirUnit(int hp,int power){
		super(hp,power);
	}
	@Override
	public void move() {
		System.out.println("공중으로 이동한다");
	}
}

class SCV extends GroundUnit{

	SCV(){
		super(100,200);
	}

	@Override
	public void create() {
		System.out.println("SCV생성완료");
		
	}

}

public class InterfaceTest3 {

	public static void main(String[] args) {
		SCV s = new SCV();
		s.actionTerran();
		s.create();
		s.move();
		System.out.println(s.getHp());
		
		
	}
}
