package ch09;

class Person{
	long id;
	
	public Person(long l) {
		this.id = l;
	}

	public boolean equals(Object obj) {
		
		//참조 변수의 형변환 전에는 instanceof로 확인해야된다
		//왜냐 Object가 최상위객체라 뭐가 들어올지 몰라서
		if(!(obj instanceof Person))
			return false;
		
		Person p = (Person)obj;
		
		//obj 와 p가 같게해줌
		return this.id == p.id;
	}
}

public class EqualsTest {


	public static void main(String[] args) {
		Person p1 = new Person(800808012321343L);
		Person p2 = new Person(800808012321343L);
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다");
		}
			
		else
			System.out.println("p1과 p2는 다른사람입니다");
	}

}
