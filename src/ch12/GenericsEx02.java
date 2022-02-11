package ch12;

import java.util.ArrayList;

class Tv {}
class Audio{}

public class GenericsEx02 {

	public static void main(String[] args) {
		//Tv 타입의 객체만 저장가능
		ArrayList<Tv> list = new ArrayList<Tv>();
		
		list.add(new Tv());
		//list.add(new Audio()); //못들어감!

		Tv t = list.get(0);  //형변환 안해줘도됨 타입이 일치하기때문
	}

}
