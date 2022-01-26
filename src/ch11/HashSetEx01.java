package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//기본 특징및 사용법
public class HashSetEx01 {

	public static void main(String[] args) {

		//중복된 문자들 전부 삭제된후 출력된다
		//1이 중복인 이유는 하나는 문자열,하나는 숫자이기 때문
		//저장한 순서가 유지된것 처럼 보이지만 유지x 순서x
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","3","4","4","4"};
		Set set = new HashSet();
		
		for(int i = 0; i< objArr.length;i++) {
			System.out.println(objArr[i]+"="+set.add(objArr[i]));
		}
		//HashSet에 저장된 요소들을 출력한다.
		System.out.println("set : "+ set);
		
		//HashSet에 저장된 요소들을 출력한다.(Iterator)
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
