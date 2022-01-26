package ch11;

import java.util.HashSet;
import java.util.Objects;


//HashSet 사용시 equals(),hashCode() 오버라이딩
public class HashSetEx03 {

	public static void main(String[] args) {

		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc"); //중복이라 저장안됨
		set.add(new Person("David",10));
		 
		//내용이 같은 객체이지만 저장됨
		//equals()랑 hashCode()를 오버라이딩안했기 때문에
		set.add(new Person("David",10));

		System.out.println(set);
	}

}

class Person {
	String name;
	int age;
	
	@Override
	public int hashCode() {
		//hash(가변인자)
		//hash 메소드가 알아서 처리해줌
		return Objects.hash(name,age);
	}

	@Override
	public boolean equals(Object obj) {
		//obj가 person과 상속관계인지 확인
		if(!(obj instanceof Person)) return false;
			
		Person p = (Person)obj;
		
		//나자신(this)의 이름과 나이를 p와 비교
		return this.name.equals(p.name) && this.age == p.age;
		
	}

	Person(){}
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + ":" + age;
	}
}
