package ch14;

import java.util.stream.Stream;

public class StreamEx04 {

	public static void main(String[] args) {
		//iterate(seed초기값,UnaryOperator(단항연산자) f)
		Stream<Integer> intStream = Stream.iterate(0, a -> a + 2);
		intStream.limit(10).forEach(System.out::println);

		//generate는 입력이 없음
		Stream<Integer> oneStream = Stream.generate(()-> 2);
		oneStream.limit(10).forEach(System.out::println);
	}

}
