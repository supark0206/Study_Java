package ch12;

import java.util.ArrayList;

class Fruit2 				{public String toString() {return"Fruit";}}
class Apple2 extends Fruit2 {public String toString() {return"Apple";}}
class Grape2 extends Fruit2 {public String toString() {return"Grape";}}

class FruitBox2<T extends Fruit2> extends Box2<T>{}


class Box2<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	ArrayList<T> getList(){return list;}
	int size() {return list.size();}
	public String toString() {return list.toString();}
	
}
class Juice{
	String name;
	
	Juice(String name) {this.name = name+"Juice";}
	public String toString() {return name;}
}

class Juicer{
	static Juice makeJuice(FruitBox2<? extends Fruit2> box){
		String tmp = "";
		
		
		//향상된 포문
		for(Fruit2 f : box.getList())
			tmp += f+" ";
		return new Juice(tmp);
			
		
	}
}

public class WildCardEx01 {

	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		
		//이건 부모라도 안된다 이럴때 와일드 카드 사용.
		//FruitBox2<Fruit2> appleBox = new FruitBox2<Apple2>();
		//이러면 Fruit2와 그자손들을 타입으로 사용해서 다룰수있다
		FruitBox2<? extends Fruit2> exBox = new FruitBox2<Apple2>();
		//하나로 여러개 다룰수있다
		exBox = new FruitBox2<Grape2>();
		exBox = new FruitBox2<Fruit2>();

	}

}
