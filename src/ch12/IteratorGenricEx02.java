package ch12;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorGenricEx02 {

	public static void main(String[] args) {

		ArrayList<Student2> list = new ArrayList<Student2>();
		list.add(new Student2("정현",1,1));
		list.add(new Student2("길동",1,2));
		list.add(new Student2("수수",2,1));
		list.add(new Student2("나나",2,2));
		
		Iterator<Student2> it = list.iterator();
		while(it.hasNext()) {
			//Student s = (Student)it.next();//제네릭 이용안하면 형변환필요함
			Student2 s = it.next(); //제네릭을 이용해서 형변환 x
			System.out.print(s.name);
			System.out.print(" "+s.cls);
			System.out.println(" "+s.num);
			System.out.println();
		}
	}

}

class Student2 {
	String name = "";
	int cls;
	int num;
	
	public Student2(String name, int cls, int num) {
		super();
		this.name = name;
		this.cls = cls;
		this.num = num;
	}
	
	
}