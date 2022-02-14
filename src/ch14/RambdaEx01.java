package ch14;

public class RambdaEx01 {

	public static void main(String[] args) {
		MyFunctionEx00 ex1 = (a,b) -> a>b?a:b;
		ex1 = (a,b) -> a>b?a:b;
		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		
		//Object 타입에는 max라는 버튼이없어서
		//객체로 가지고있어도 사용을 할 수가없다
		//int value = obj.max(3,5); 에러.
		
	
	}

}
interface MyFunctionEx00{
	public abstract int max(int a,int b);
}
