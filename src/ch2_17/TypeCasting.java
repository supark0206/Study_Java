package ch2_17;

public class TypeCasting {

	
	public static void main(String[] args) {
		String str = "3";
		
		//문자열3을 문자3으로 변경
		//charAt() 은 String 으로 저장된 문자열중에 한글자만
		//char타입으로 변환해 준다.
		System.out.println(str.charAt(0)); 
		
		//문자열 숫자로 변환
		System.out.println(Integer.parseInt(str));
		
		//문자열 더하기 숫자 = 문자열
		//31
		System.out.println("3"+1);
	}

}
