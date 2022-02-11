package ch12;

import java.util.HashMap;

public class IteratorGenricEx01 {

	public static void main(String[] args) {
		HashMap<String,Student> map = new HashMap<>();
		map.put("자바왕", new Student("자바왕", 1, 1, 100, 90, 80));
		
		Student s = map.get("자바왕");
		
		System.out.println(map);
	}

}

class Student {
	String name = "";
	int cls;
	int num;
	
	int kor;
	int eng;
	int math;
	
	
	public Student(String name, int cls, int num, int kor, int eng, int math) {
		super();
		this.name = name;
		this.cls = cls;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	

	
	
}