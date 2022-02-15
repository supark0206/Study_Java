package ch14;

import java.util.Optional;

public class OptionalEx01 {

	public static void main(String[] args) {
		int[] arr = new int[0];	
		System.out.println("arr.length="+arr.length);
		
		//빈 optional생성
		Optional<String> optVal = Optional.empty();
		System.out.println("opt="+optVal);
		
		//Optional값이 null이면 "비어있음"반환
		System.out.println(optVal.orElse("비어있음"));
		
		Optional<String> optVal2 = Optional.of("abc");
	
		System.out.println("optVal2="+optVal2.orElse(""));
		System.out.println(optVal2.orElseGet(String::new));//메소드참조 가능,람다식가능
	}

}
