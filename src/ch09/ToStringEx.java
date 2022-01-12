package ch09;

import java.util.Objects;

class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE",1);
	}
	Card(String kind , int number){
		this.kind = kind;
		this.number = number;
	}

	//Object 클래스의 toString 을 오버라이딩
	//오버라이드 하지않으면 이상한 값이나옴
	@Override
	public String toString() {
		return kind+ " , " + number;
	}
	
	//equals가 다르다고 나와서 오버라이드
	//왜 다른가? Object 클래스의 hashcode 값은 실제로 다르기때문
	//그래서 hashcode()도 같이 오버라이드 해줘야한다
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Card)) return false;
		
		Card c = (Card)obj;
		return this.kind.equals(c.kind) && this.number == c.number;
		
			
	}

	//iv 가 같으면 같은 hashcode도 같게해줌
	@Override
	public int hashCode() {
		return Objects.hash(kind,number);
	}
	
	
	//이클립스 기능으로 자동으로 hashcode와 equals를 오버라이드 해준다.
}


public class ToStringEx {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
	}

}
