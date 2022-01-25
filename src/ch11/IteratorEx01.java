package ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorEx01 {

	public static void main(String[] args) {
		//Collection list = new ArrayList();//이렇게하면 collection에 있는 것만 사용가능
		ArrayList list = new ArrayList(); 
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator(); // 1회용
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		//iterator는 1회용이라 다시쓰려면 다시 얻어와야한다
		it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		//이렇게 사용하면 ArrayList를 HashSet으로 바꾸면 
		//HashSet에는 get메소드가 없어서 바꿔줘야한다
		//iterator를 사용하면 위의 메소드로 표준화 되어있어서
		//코드 수정이 줄어든다
		for(int i =0;i<list.size();i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}
	

}
