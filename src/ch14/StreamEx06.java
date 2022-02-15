package ch14;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx06 {

	public static void main(String[] args) {
	
		//파일 배열 생성
		File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"),new File("Ex2.java"),
				new File("Ex3")		
		};
	
		Stream<File> fileStream = Stream.of(fileArr);
		
		//map()으로 Stream<File>을 Stream<String>로 변환
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println); //모든 파일 이름 출력
		
		System.out.println("----");
		fileStream = Stream.of(fileArr);//스트림 다시 생성
		
		fileStream.map(File::getName)
		.filter(s -> s.indexOf('.')!=-1)// 확장자 없는 것은 제외
		.map(s->s.substring(s.indexOf('.')+1)) // 확장자만 추출
		
		.peek(a->System.out.printf("filename:%s%n",a))//중간에 확인할 때 사용
		
		.map(String::toUpperCase) //대문자 변환
		.distinct()  //중복제거
		.forEach(System.out::println);
	}
}
