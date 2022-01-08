package ch07;

class Car1{
	String color;
	int door;
	
	void drive() {//운전하는 기능
		System.out.println("drive~~");
	}
	void stop() {//멈추는 기능
		System.out.println("stop!!");
	}
}

class FireEngine1 extends Car1{
	void Water() {//물뿌리는 기능
		System.out.println("Water!!!!");
	}
}

public class typeCastingCar2 {
	void doTypeCasting(Car1 c) {
		if (c instanceof FireEngine1){ // 형변환 가능한지 확인
			FireEngine1 fe = (FireEngine1)c;// 확인후 형변환
		}
	}
	
	public static void main(String[] args) {

	}

}
