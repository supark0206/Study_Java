package ch11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//TreeSet은 비교 기준이 필요하다
public class TreeSet01 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		Set set2 = new TreeSet(new TestComp());//비교 기준 들어감
		
		for(int i = 0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			//Integer는 비교기준을 갖고있다.
			System.out.println(set.add(num));
		}
		//정렬을 안해도 자동으로 정렬해준다
		System.out.println(set);
		
		set2.add(new Test()); //비교 기준이 없으면 에러가 난다
		System.out.println("비교기준 연습"+ set2);
	}

}

//이상태면 비교 기준을 만들어서 넣어줘야한다
class Test{}

//객체가 직접 비교기준을 갖고있음
//Comparable을 사용하면 비교기준 따로 x
class Test1 implements Comparable{

	@Override
	public int compareTo(Object o) {
		return 0;
	}
	
}


class TestComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}