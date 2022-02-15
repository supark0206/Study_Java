package ch14;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx07 {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[] { "aa1", "aa2", "aa3" },
				new String[] { "Bb1", "Bb2", "bB3" }
				);
		
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		strStrm.map(String::toLowerCase)//소문자로 전부 변경
		.distinct()//중복제거
		.sorted()//정렬
		.forEach(System.out::println);
		System.out.println();

	}
}
