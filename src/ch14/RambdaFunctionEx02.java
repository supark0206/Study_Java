package ch14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RambdaFunctionEx02 {

	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa","bbb","ccc");
		
		/*
		 *원래 이런 코드가
		Collections.sort(list,new Comparator<String>() {
			public int compare(String s1,String s2) {
				return s2.compareTo(s1);
			}
		});
		*/
		
		//람다식 사용
		Collections.sort(list,(s1,s2)->s2.compareTo(s1));
	}

}

