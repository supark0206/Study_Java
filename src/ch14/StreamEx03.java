package ch14;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamEx03 {

	public static void main(String[] args) {
		//ints(a부터,b까지) 범위의 난수를 구함
		//ints()비우고 생성가능
		IntStream intStream = new Random().ints(5,10);//무한 난수스트림
		intStream
		.limit(5) //5개만 자르기
		.forEach(System.out::println);
		
		//특정범위의 정수를 갖는 스트림 생성
		System.out.println("특정범위 스트림 생성");
		IntStream rangeStream1 = IntStream.range(1, 5);//1부터 5까지 스트림 생성 1,2,3,4까지만 찍힘
		//Closed는 끝이 포함됨
		IntStream rangeStream2 = IntStream.rangeClosed(1, 5);//1부터 5까지 스트림 생성 1,2,3,5까지 찍힘
		rangeStream1.forEach(System.out::println);
		
	}

}
