package ch07;

//다형성의 장점!
public class PolymorphismEx {

	public static void main(String args[]) {
		Buyer b = new Buyer();
		/*
		 * 밑의 한줄로 요약가능
		Product p = new Tv();
		b.buy(p);
		*/
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
	}
	
}

class Product {
	int price;// 가격
	int bonusPoint;// 보너스점수	
	Product() {} //기본생성자
	public Product(int price, int bonusPoint) {
		super();
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}
class Buyer{
	int money = 10000;
	int bonusPoint = 0;
	
	/*
	void buy(Tv t) {
		money -= t.price;
	}
	void buy(Computer c) {
		money -= c.price;
	}
	void buy(Audio a) {
		money -= a.price;
	}
	이렇게 안해주고 상속받은 Product 하나로 사용
	*/
	// 다형성의 장점을 보여준다
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입하셨습니다.");
		System.out.println("남은 돈은 "+money);
		System.out.println("보너스 포인트는 "+bonusPoint);	
	}
}
class Tv extends Product {
	Tv(){super(200,300);}
	public String toString() { return "Tv";}
}
class Computer extends Product {
	Computer(){super(1200,1300);}
	public String toString() { return "Computer";}
}
class Audio extends Product {
	Audio(){super(50,50);}
	public String toString() { return "Audio";}

}


