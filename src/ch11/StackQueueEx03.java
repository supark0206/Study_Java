package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackQueueEx03 {
	
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		System.out.println("help 입력시 도움말");
		
		while(true) {
			System.out.println(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equalsIgnoreCase("q")) {
					System.exit(0); // 프로그램 종료
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말");
					System.out.println("q ,Q - 프로그램 종료");
					System.out.println("history - 최근 입력 명령어를 " + MAX_SIZE +"개 보여줍니다");
				}else if(input.equalsIgnoreCase("history")) {
					save(input); //입력받은 명령어를 저장
					
					//링크드리스트 내용을 보여준다
					LinkedList list = (LinkedList)q;
					
					//사이즈는 반복문돌면서 크기가 변하지x
					//그래서 상수값으로 크기 저장
					//사이즈 메소드를 직접 반복문에 넣으면 계속 호출되서 안좋다
					final int SIZE = list.size();
					for(int i = 0;i<SIZE;i++) {
						System.out.println((i+1)+"."+list.get(i));
					} 
				}else {
					save(input);
					System.out.println(input);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	
	}
	public static void save(String input) {
		if(!"".equals(input))
			q.offer(input); // 큐에 명령어 저장
		
		//최대크기를 넘으면 제일 처음 입력된것을 삭제
		if(q.size() > MAX_SIZE) // size()는 Collection인터페이스에서 정의
			q.remove(); //
	}
	
}
