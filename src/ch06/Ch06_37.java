package ch06;

public class Ch06_37 {
	String color;
	String price;
	String name;
	
/*	
 * Ch06_37(String a,String b,String c){
		(iv)color = (lv)a;
		price = b;
		name = c;

	}
	같은 클래스여서 this 생략가능
	변수명이 다르기때문에 구별이 가능하다
*/
	
	Ch06_37(String color,String price,String name){
		this.color = color;
		this.price = price;
		this.name = name;
		//이름이 똑같아서 규별이 안된다
		//this를 붙여서 인스턴스변수라는걸 알려준다 
		//this를 안붙이면 둘다 지역변수이게 되버림 
		//왜냐면 변수가 더가까운게 지역변수 이기때문에

	}



}
