package ch05;

import java.util.Arrays;

public class ch05_6 {

	public static void main(String[] args) {
		int [] exArr = {100,55,33,22,11};
		
		//for 문을 이용한 출력
		for(int i = 0; i<exArr.length;i++) {
			System.out.println("for문 = "+exArr[i]);
		}
		
		//Arrays 클래스를 이용한 출력
		System.out.println("Arrays클래스 = " + Arrays.toString(exArr));

	}

}
