package ch07;

class Car{
	String color;
	int door;
	
	void drive() {//운전하는 기능
		System.out.println("drive~~");
	}
	void stop() {//멈추는 기능
		System.out.println("stop!!");
	}
}

class FireEngine extends Car{
	void Water() {//물뿌리는 기능
		System.out.println("Water!!!!");
	}
}

public class typeCastingCar {

	public static void main(String[] args) {
		Car car = new Car();
		FireEngine fe = (FireEngine)car; //형변환시 실제 인스턴스가 무엇인지가중요하다
		fe.Water(); // car 객체이기 때문에 형변환 했다고 water 메소드를 사용할 수 없다

		/*
		FireEngine fe2 = (FireEngine)car;//조상 -> 자손으로 형변환
		Car car2 = (Car)fe2; //자손 -> 조상으로 형변환
		*/
	}

}
