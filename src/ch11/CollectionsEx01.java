package ch11;

import java.util.*;


import static java.util.Collections.*; //앞에 Collections 를 생략하게 해준다

public class CollectionsEx01 {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);

		addAll(list,1,2,3,4,5);
		System.out.println(list);
		
		rotate(list,2); //반시계방향으로 두번회전
		System.out.println(list);
		
		swap(list,0,2);//인덱스 0, 2 자리바꿈
		System.out.println(list);

		shuffle(list); //저장된 요소 위치를 임의로 변경
		System.out.println(list);
		
		sort(list,reverseOrder()); //역순정렬
		System.out.println(list);
		
		sort(list);
		System.out.println(list);

		//binarySearch 전에는 항상 정렬먼저!!!
		int idx = binarySearch(list,3); // 3이 저장된위치
		System.out.println("index of 3:"+idx);
		
		System.out.println("max : " + max(list));
		System.out.println("min : " + min(list));
		System.out.println("max : " + min(list,reverseOrder()));
		
		fill(list,9);//9로 채운다
		
		List newList = nCopies(list.size(),2);// 크기의 새로운 list 생성후 2로채운다
		System.out.println("newList : "+newList);
		
		System.out.println(disjoint(list, newList));//공통요소가 없으면 true
		
		copy(list,newList);//newList를 list에 복사
		
		replaceAll(list,2,1);//2를 1로바꿈
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		
		System.out.println("list2 = "+ list2);
		
		
		
		
		

	}

}
