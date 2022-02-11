package ch12;

enum Direction2 {
	//0,1,2,3 순서대로가 아닌 다른값 넣는법
	EAST(1,"오른쪽"),SOUTH(2,"아래"),WEST(3,"왼쪽"),NORTH(4,"위");

	private static final Direction2[] DIR_ARR = Direction2.values();
	private final int value;
	private final String symbol;
	
	Direction2(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() 	  {return value;}
	public String getSymbol() {return symbol;}
	
	public static Direction2 of(int dir) {
		if(dir<1 || dir>4)//0~3벗어나면 예외
			throw new IllegalArgumentException("Invalid value : " + dir);
		
		return DIR_ARR[dir-1];
	}
	
	//방향을 회전시키는 메서드 num 값만큼 90도씩 시계방향으로 회전
	
	public Direction2 rotate(int num) {
		//방향이 4니까
		//4보다 큰건 나머지로 구해서 연산을 줄인다
		//EX) 5면 4의 나머지 1만 회전하면됨
		num = num%4;
		
		if(num<0) num+=4; //음수면 반대방향으로 회전
		
		return DIR_ARR[(value-1+num)%4];
	}
	
	@Override
	public String toString() {
		return name()+getSymbol();
	}
	
}

public class EnumEx02 {

	public static void main(String[] args) {
		for(Direction2 d : Direction2.values())
			System.out.printf("%s=%d%n",d.name(),d.getValue());
	
	
		Direction2 d1 = Direction2.EAST;
		Direction2 d2 = Direction2.of(1);
		
		System.out.printf("d1=%s,%d%n",d1.name(),d1.getValue());
		System.out.printf("d1=%s,%d%n",d2.name(),d2.getValue());
		System.out.println(Direction2.EAST.rotate(1));
		System.out.println(Direction2.EAST.rotate(2));
		System.out.println(Direction2.EAST.rotate(-1));
		System.out.println(Direction2.EAST.rotate(-2));
	
	}
}
