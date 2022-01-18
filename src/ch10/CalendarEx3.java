package ch10;

import java.util.Calendar;

public class CalendarEx3 {

	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		//Calendar 객체를 생성
		Calendar cal01 = Calendar.getInstance();
		Calendar cal02 = Calendar.getInstance();
	
		//month의 경우 0부터 시작하기 때문에 4월인경우 3로 지정
		//date.set(2019, Calendar.APRIL,29); 도 가능
		
		cal01.set(2019,3,29); //set을 이용해서 날짜 설정 
		System.out.println("cal01은 : "+toString(cal01));

		//날짜 계산은 초단위로 바꿔서 계산을 해줘야한다
		//1000분의 1초 단위기때문에 1000으로 다시나눠줌
		long difference = 
				((cal02.getTimeInMillis() - cal01.getTimeInMillis())/1000);
		System.out.println("두 날짜의 차이는 : " + difference +"초가 지났습니다");
		
		System.out.println("day 로 계산하면 : "+difference/(24*60*60));
	}
	


	private static String toString(Calendar date) {
		// TODO Auto-generated method stub
		return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH)+1) +"월"
				+ date.get(Calendar.DATE)+ "일";
	}


}
