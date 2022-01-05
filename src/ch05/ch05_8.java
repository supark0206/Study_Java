package ch05;

public class ch05_8 {
	public static void main(String[] args) {
		// 총합과 평균
		
		int sum = 0;
		float average = 0f;
		
		int[] num = {100,88,100,100,90};
		
		for(int i = 0;i < num.length; i++) {
			sum += num[i];
		}
		
		average = sum / (float)num.length ;
		
		System.out.println("총합 = "+ sum);
		System.out.println("평균 = "+ average);

	}

}
