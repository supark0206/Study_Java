package ch08;

public class ExceptionTest2 {

	public static void main(String[] args) {
			System.out.println(1);
			System.out.println(2);
		try {
			
			System.out.println(3);
			System.out.println(args[0]); //예외발생
			System.out.println(4);// 발생후의 문장은 실행 x
			
		}catch(Exception e1) {//예외사항 (e1)이 발생할 경우 이를 처리하기위한 문장
			
			e1.printStackTrace(); //예외 정보를 알려줌
			System.out.println("예외 사항 발생!");
			System.out.println("예외 메시지 : " + e1.getMessage());
		}
	}
	
}
