package ch10;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx2 {

	public static void main(String[] args) {
		int year = 0;
		int month = 0;
		int START_DAY_OF_WEEK = 0; //1일의 요일
		int END_DAY = 0;
		
		System.out.println("달력의 년, 월을 입력하세요");

		Scanner sc = new Scanner(System.in);
		System.out.print("YEAR : ");
		year = Integer.parseInt(sc.next());
		System.out.print("MONTH : ");
		month = Integer.parseInt(sc.next());
	
		
		Calendar sDay = Calendar.getInstance();//시작일
		Calendar eDay = Calendar.getInstance();//끝일
		
		
		//월의 경우 0 부터 11까지의 값을 가져서 1을 빼줘야한다
		sDay.clear();
		eDay.clear();
		sDay.set(year, month-1,1);
		eDay.set(year, month,1);
		
		//다음달의 첫날 에서 하루를 빼면 현재달의 마지막 일자이다
		eDay.add(Calendar.DATE, -1);
		
		//첫 번째 요일이 무슨 요일인지 알아낸다.
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		//eDay에 지정된 날짜르 얻어온다.
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("    "+year+"년" + month + "월");
		System.out.println( " SU MO TU WE TH FR SA");
		
		for(int i = 1;i <START_DAY_OF_WEEK;i++)
			System.out.print("   ");
		for(int i = 1, n=START_DAY_OF_WEEK ; i<=END_DAY; i++,n++) {
			System.out.print((i<10)? "  "+i : " " + i);
			if(n%7==0) System.out.println();
			
			
		}
	
	}


}
