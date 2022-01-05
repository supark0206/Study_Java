package ch05;

public class ch05_9 {

	public static void main(String[] args) {
		
		int[] num = {1,20,55,39,90,5}; 
		int max = num[0];
		int min = num[0];
		
		for(int i = 1;i<num.length;i++) {
			if(num[i]>max) {
				max = num[i];
			}else if(num[i]<min) {
				min = num[i];
			}
		}
		
		System.out.println("최대값 = "+max);
		System.out.println("최소값 = "+min);
	}

}
