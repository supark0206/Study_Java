package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
	
		//list를 데이터 소스로하는 새로운 스트림을 생성
		Stream<Integer> intStream = list.stream();
		intStream.forEach(System.out::print);
		
		System.out.println();
		//stream은 1회용 최종연산을 수행하면 stream은 닫힌다
		//또 사용하려면 스트림 다시 생성
		intStream = list.stream();
		intStream.forEach(System.out::print);

		
	}

}
