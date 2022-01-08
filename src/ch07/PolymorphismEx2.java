package ch07;

//다형성의 장점!
public class PolymorphismEx2 {

	public static void main(String args[]) {
		Buyer2 b = new Buyer2();

		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());

		b.summary();
	}
	
}

class Product2 {
	int price;// 가격
	int bonusPoint;// 보너스점수	
	Product2() {} //기본생성자
	public Product2(int price, int bonusPoint) {
		super();
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}
class Buyer2{
	int money = 10000;
	int bonusPoint = 0;
	Product2 cart[] = new Product2[10];//구입한 문건을 담을 배열
	
	int i = 0; 							//장바구니 상품 개수
	
	void buy(Product2 p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		cart[i++] = p;					//제품을 Product[] cart 에 저장한다
		
		System.out.println(p + "를 구입하셨습니다.");
		System.out.println("남은 돈은 "+money);
		System.out.println("보너스 포인트는 "+bonusPoint);	
	}
	
	void summary() { 				 //구매한 물품에 대해 정보를 요약해서 보여준다
		int sum = 0;  				// 구입한 물품의 가격 합계
		String itemList = ""; 		// 구입한 물품 목록
		
		for(int i = 0; i<cart.length;i++) {
			if(cart[i]==null) break;  //cart 가 null 이면 그냥 멈춤
			sum += cart[i].price;     // null 아니면 가격들을 더해서 sum에
			itemList += cart[i] + ",";// itemList에 cart를 하나씩 넣는다
		}
		System.out.println("총 제품 금액은 " + sum + " 입니다");
		System.out.println("제품 들은 " +  itemList + "입니다");
		
		
	}
}

class Tv2 extends Product2 {
	Tv2(){super(200,300);}
	public String toString() { return "Tv";}
}
class Computer2 extends Product2 {
	Computer2(){super(1200,1300);}
	public String toString() { return "Computer";}
}
class Audio2 extends Product2 {
	Audio2(){super(50,50);}
	public String toString() { return "Audio";}

}


