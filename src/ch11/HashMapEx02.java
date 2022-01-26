package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx02 {

	//학생들 점수 보기, 총점,최저점,최고점 구하기
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("박정현",new Integer(90));
		map.put("박정현",new Integer(100));
		map.put("이자바",new Integer(100));
		map.put("강자바",new Integer(80));
		map.put("안자바",new Integer(90));
		
		//키만
		Set set = map.keySet();
		System.out.println("참가자명단:"+set);
		
		//키 밸류 둘다
		set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			//Entry는 Map 안에 정의된 인터페이스이다
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : "+e.getKey()+ ", 점수 : "+e.getValue());
		}
		
		//값만
		Collection values = map.values();
		it = values.iterator();
		int total = 0;
		
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : "+ (float)total/set.size() );
		System.out.println("최고점 : "+ Collections.max(values));
		System.out.println("최저점 : "+ Collections.min(values));
	}

}
