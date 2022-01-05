package ch05;

import java.util.Arrays;

public class ch05_16 {

	public static void main(String[] args) {
		//커맨드 라인을 통해 입력받기
		System.out.println("매개변수의 개수 : " + args.length);
		for(int i = 0 ; i< args.length;i++) {
			System.out.println("args["+i+"] = \"" + args[i] + "\"");
		}
		
	}

}
