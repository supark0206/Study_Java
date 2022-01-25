package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// 기본 길이가 10인 ArrayList 생성
		ArrayList list1 = new ArrayList(10);

		//ArrayList에는 객체만 저장가능
		//autoboxing에 의해 기본형이 참조형으로 자동변환
		//그래스 list1.add(5) 이것도 가능하다
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));		
		
		//subList로 만들어지면 읽기전용이다
		//새로운 ArrayList에 담아야 변경가능
		//index 1~4까지 잘라서 새롭게 생성 4는 제외
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
		//오름차순으로 정렬
		//Collection은 인터페이스 , Collections는 유틸 클래스 (ex)Math클래스
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);
		
		//list1이 list2의 모든요소를 포함하는지
		System.out.println("list1.containsAll(list2):"+ list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");//원하는위치로 삽입
		print(list1,list2);
		
		list2.set(3, "AA"); //3번째값을 새로운 객체로 변경
		print(list1,list2);
		
		list1.add(0, "1");//값이 같아도가능한이유는 하나는 문자열이고 하나는Integer이기 때문이다
		//객체가 어디에있는지 검색
		System.out.println("index="+list1.indexOf(1));
		System.out.println("index="+list1.indexOf("1"));
		list1.remove(1);//인덱스가1인 객체 삭제
		list1.remove(new Integer(1));//1을 삭제
		print(list1,list2);

		//list1에서 list2와겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list1.retainAll(list2) : " +list1.retainAll(list2));
		print(list1,list2);

		//list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i=list2.size()-1; i>=0;i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	
	}

	
	//출력 메서드
	    static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1" + list1);
		System.out.println("list2"+ list2);
		System.out.println();
	}

}
