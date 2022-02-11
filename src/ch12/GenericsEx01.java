package ch12;

import java.util.ArrayList;

public class GenericsEx01 {

	public static void main(String[] args) {
		//ArrayList list = new ArrayList();
		//이렇게하면 컴파일러가 잘못된 타입이 들어가는걸 컴파일러가 잡아줌
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		// 컴파일은 가능
		// 문자열로 저장됨
		//list.add("40");
		
		
		//list.get(3) 은 오브젝트
		//이걸 Integer로 형변환 
		//하지만 get(3)은 String형이 저장되어있어서 형변환 에러 발생
		//이러한 형변환 문제를 해결하기 위한게 Generics
		Integer i = list.get(2); //(Integer)list.get(3);
		//그리고 Generics를 사용하고나면 전부 Integer인걸 알기 때문에 형변환 생략가능
	}

}
