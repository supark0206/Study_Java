package ch06;

public class Ch06_27 {
	long a, b; // 인스턴스 변수

	long add() {
		return a + b;// 인스턴스변수
	}

	static long add(long a,long b /*지역변수*/) {
		return a+b;//지역변수
	}

	public static void main(String[] args) {
		Ch06_27 m = new Ch06_27();

		m.a = 1;
		m.b = 3;
		System.out.println(m.add()); // 인스턴스 메소드

		System.out.println(Ch06_27.add(3, 5));// statc 메소드

	}

}
