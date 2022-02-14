package ch14;

public class RambdaFunctionEx01 {

	public static void main(String[] args) {
/*		MyFunction2 f = new MyFunction2(){
			public int max(int a,int b) { //오버라이딩 - 접근제이자는 좁게 못바꾼다
				return a > b ? a:b;
			}
		};
		*/
		
		MyFunction2 f = (a,b) -> a>b?a:b; //람다식 , 익명객체
		int value = f.max(3,5);

		System.out.println(value);
	}

}

//함수형 인터페이스는 추상메서드 하나만 가져야함 
@FunctionalInterface  //추상메서드 하나만 있는지 검사
interface MyFunction2{
	public abstract int max(int a,int b);
}
