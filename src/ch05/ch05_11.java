package ch05;

import java.util.Arrays;

public class ch05_11 {

	public static void main(String[] args) {
		//로또 번호 구하기
		int[] num = new int[45]; // 1~45 숫자
		
		int tmp = 0;  //두값을 바꾸는 변수
		int j = 0; //임의의 값을 저장 할 변수
		
		for(int i = 0;i<num.length;i++) {
			num[i] = i+1;
		}
	
		//배열을 suffle 해준다
		for(int i =0;i<6;i++) {
			j = (int)(Math.random()*45);
			tmp = num[i];
			num[i] = num[j];
			num[j] = tmp;
		}

		//출력
		for(int i = 0; i<6;i++) {
		System.out.println((i+1)+"번째 숫자는? = "+ num[i]);
		}
		
	}

}
