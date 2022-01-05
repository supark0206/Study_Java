package ch06;

public class Ch06_36 {
	String color;
	String price;
	String name;
	
	Ch06_36(){
		/*
		 * color = white;
		 * price = 3000;
		 * name = 붕붕;
		 * 이건 중복코드기때문에 
		 * 밑에서 사용한 메소드를 재사용
		 * 원래는 클래스명을 사용하지만 this로 사용한다
		 */
		this("white","3000","붕붕");
	} 

	Ch06_36(String a,String b,String c){
		color = a;
		price = b;
		name = c;

	}
	


}
