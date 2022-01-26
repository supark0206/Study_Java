package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


//1~45 까지의 숫자 출력
public class HashSetEx02 {

	public static void main(String[] args) {

		Set set = new HashSet();
		
		for(int i = 0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			System.out.println(set.add(num));
		}
		System.out.println("=정렬x=");
		System.out.println(set); //이렇게 하면 정렬되지않은 상태로 출력됨
		
		//set 의 모든 요소를 list에 저장한다
		//list를 정렬
		//list 출력
		System.out.println("=정렬됨=");
		LinkedList list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);


	}

}
