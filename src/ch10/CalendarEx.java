package ch10;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		//Calendar 객체를 생성
		Calendar cal = Calendar.getInstance();

		System.out.println("올해의 년도" +cal.get(Calendar.YEAR) );
		System.out.println("월(0~11)" + cal.get(Calendar.MONTH));
		System.out.println("이해의 몇 째 주" + cal.get(Calendar.WEEK_OF_YEAR) );
		System.out.println("이달의 몇 째 주" + cal.get(Calendar.WEEK_OF_MONTH) );
		System.out.println("시간" + cal.get(Calendar.HOUR));
		System.out.println("분" + cal.get(Calendar.MINUTE));
		System.out.println("초" + cal.get(Calendar.SECOND));
		System.out.println("시간 (0~23)" + cal.get(Calendar.HOUR_OF_DAY));

		

	}

}
