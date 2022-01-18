package ch09;

import java.util.ArrayList;

public class Boxing {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);//JDK1.5부터 변경 오토박싱으로 가능함
		list.add(new Integer(100));//원래는 이렇게 객체만저장가능

//		Integer i = list.get(0);//list에 저장된 첫번째 객체를 꺼낸다
		
//		int i = list.get(0).intValue();//intValue()로 Integer를 int로 변환
		int i = list.get(0);//list에 저장된 첫번째 객체를 꺼낸다

	}

}
