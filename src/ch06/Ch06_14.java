package ch06;

public class Ch06_14 {

	public static void main(String[] args) {
		int a = add(1, 3);
		System.out.println(a);
	}

	static int add(int a, int b) // 반환타입 메서드이름(입력값1,입력값2)
	{
		int result = a + b; // 동작
		return result; // 결과 반환 결과는 0~1개 까지만 가능.
		// 반환값이 없다면
	}
}
