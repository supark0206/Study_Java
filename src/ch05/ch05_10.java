package ch05;

import java.util.Arrays;

public class ch05_10 {

	public static void main(String[] args) {
		
	int[] num = {0,1,2,3,4,5,6,7,8,9};
	System.out.println(Arrays.toString(num));
	
	for(int i = 0; i<100 ; i++) {
		int n = (int)(Math.random() * 10);
		//빈 값에 0번째 값을 담아둠
		int tmp = num[0];
		//n번째 값을 0번째 값에 넣는다
		num[0] = num[n];
		//아까 담아둔 0번째 값을 n번째에다 넣어서 바꿔준단
		num[n] = tmp;
		
		}
		System.out.println(Arrays.toString(num));
	}

}
