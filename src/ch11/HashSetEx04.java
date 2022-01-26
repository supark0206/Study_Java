package ch11;

import java.util.HashSet;
import java.util.Iterator;

//교집합,차집합,합집합
public class HashSetEx04 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setCha = new HashSet();
		HashSet setHap = new HashSet();
		HashSet setKyo = new HashSet();

		for (int i = 1; i < 6; i++) {
			setA.add(i);
			setB.add(i + 3);
		}
		System.out.println("A" + setA);
		System.out.println("B" + setB);

		// 차집합 하는법
		Iterator it = setA.iterator();
		while (it.hasNext()) {
			Object tmp = it.next();
			// setB가 tmp를 포함하지않으면 tmp를 합집합에 추가해라
			if (!setB.contains(tmp)) {
				setCha.add(tmp);
			}

		}
		
		
		//합집합에
		//다 넣기만 하면 중복 알아서 제거해준다

		it = setA.iterator();
		while (it.hasNext())
			setHap.add(it.next());

		it = setB.iterator();
		while (it.hasNext())
			setHap.add(it.next());


		// 교집합 하는법
		it = setB.iterator();
		while (it.hasNext()) {
			Object tmp = it.next();
			// contians로 setB와 같은 객체를 포함하는지 확인한다
			// 같을때 같은 객체를 교집합에 넣는다
			if (setA.contains(tmp))
				setKyo.add(tmp);
		}

		System.out.println("A에서B의차집합" + setCha);
		System.out.println("합집합" + setHap);
		System.out.println("교집합" + setKyo);
		System.out.println("쉽게하기===");
		//쉽게하는 방법===
		//setA.retainAll(setB);//교집합 . 공통된 요사만 남기고 삭제
		//setA.addAll(setB);//합집합. setB의 모든 요소를 추가함
		//setA.removeAll(setB);//차집합 setA가 가지고있는 setB의 요소제거

	}

}
