package ch14;

import java.util.function.Function;

public class RambdaFunctionEx03 {

	
	public static void main(String[] args) {
		
		//람다식
		Function<String,Integer> f= (String s) -> Integer.parseInt(s);
		System.out.println(f.apply("100")+200);
		
		//메서드 참조 , 클래스이름::메서드이름
		Function<String,Integer> f2 = Integer::parseInt;
		System.out.println(f2.apply("222"));
		
	}

}

