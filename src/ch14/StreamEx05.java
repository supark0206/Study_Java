package ch14;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx05 {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
				new Student("박정현1",1,100),
				new Student("박정현2",2,200),
				new Student("박정현3",3,150),
				new Student("박정현4",2,120),
				new Student("박정현5",2,300),
				new Student("박정현6",1,250)
		);
		
		studentStream.sorted(Comparator.comparing(Student::getBan)//1.반별정렬
		.thenComparing(Comparator.naturalOrder()) //2.기본정렬
		)
		.forEach(System.out::println);
	}
}

class Student implements Comparable<Student> {
	String name;
	int ban;
	int totalScore;

	Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %d, %d]",name,ban,totalScore);
	}
	
	//getter
	String getName() {return name;}
	int getBan() {return ban;}
	int totlaScore() {return totalScore;}

	// 총점 내림차순을 기본 정렬로 한다
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return s.totalScore - this.totlaScore();
	}

}
