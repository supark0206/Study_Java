package ch08;

public class ExceptionTest01 {

	public static void main(String[] args) {

		try {
			//예외가 발생할 가능성이있는 문장
			System.out.println(args[0]);			
		}catch(Exception e1) {
			//예외사항 (e1)이 발생할 경우 이를 처리하기위한 문장
			System.out.println("예외 사항 발생!");
		}
	}

}
