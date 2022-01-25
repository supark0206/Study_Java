package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class ComparaEx {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog","lion","tiger"};
		
//		Arrays.sort(strArr,정렬기준); 없어도 되는이유는 String 클래스가 이미 정렬기준을 가지고있다
		Arrays.sort(strArr); 
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);//(정렬대상,정렬기준) //대소문자 구분안함
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); //역순 정렬 
		System.out.println("strArr=" + Arrays.toString(strArr));
		
	}

}

class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			//기본 정렬기준에 * -1 을 해준다 그래서 정렬방식이 역으로 변경됨
			return c1.compareTo(c2) * -1; 
			
		}
		return -1;
	}
}