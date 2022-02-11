package ch12;

//열거형 선언
//하나하나가 객체라 equals로 비교가능
//              0     1    2    3  
enum Direction {EAST,SOUTH,WEST,NORTH};

public class EnumEx01 {

	public static void main(String[] args) {
		//열거형 상수 얻는법
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");

		System.out.println("d1 = "+ d1);
		System.out.println("d2 = "+ d2);
		System.out.println("d3 = "+ d3);
		
		System.out.println("d1 == d2 ? "+(d1 == d2));
		System.out.println("d1 == d2 ? "+(d1 == d2));
		System.out.println("d1 == d2 ? "+(d1.equals(d3)));
	//	System.out.println("d2>d3"+(d1>d3)); 에러
		System.out.println("d1.compareTo(d3)"+d1.compareTo(d3));//같아서 0
		System.out.println("d1.compareTo(d2)"+d1.compareTo(d2));// 값차이나는만큼 - 
		
		switch(d1){
		case EAST:
			System.out.println("The direction is EAST."); break;
			
		case SOUTH:
			System.out.println("The direction is SOUTH."); break;
			
		case WEST:
			System.out.println("The direction is WEST."); break;
			
		case NORTH:
			System.out.println("The direction is NORTH."); break;
		
		default:
			System.out.println("Invalid direction"); break;
		
		}
		//열거형이 모든 상수를 배열로반환
		Direction[] dArr = Direction.values();
		
		for(Direction d : dArr)
			System.out.printf("%s=%d%n",d.name(),d.ordinal());
		// 값과 (ordinal)순서를 반환 
	}

}
