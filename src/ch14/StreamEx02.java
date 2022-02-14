package ch14;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx02 {

	public static void main(String[] args) {
		//배열로부터 스트림 생성1
		Stream<String> strStream1 = Stream.of(new String[] {"a","b","c"});
		strStream1.forEach(System.out::println);
		
		//배열로부터 스트림 생성2
		String[] strArr = new String[] {"aa","bb","cc"};
		Stream<String> strStream2 = Stream.of(strArr);
		strStream2.forEach(System.out::println);
		
		//배열로부터 스트림 생성3
		Stream<String> strStream3 = Arrays.stream(strArr);
		strStream3.forEach(System.out::println);
		
		//기본형 배열로부터 스트림 생성1
		int[] intArr1 = {1,2,3,4,5,6};
		IntStream intStream = Arrays.stream(intArr1);
		intStream.forEach(System.out::println);
		
		//이건 Integer 객체배열의 스트림 생성이다
		Integer[] intArr2 = {1,2,3,4,5,6};
		Stream<Integer> intStream2 = Stream.of(intArr2);//Integer객체 배열 스트림
		intStream2.forEach(System.out::println);
		
	}

}
