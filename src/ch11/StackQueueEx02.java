package ch11;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx02 {

	public static void main(String[] args) {

		Stack st = new Stack();
		String expression = "((3+5)*8-2)";
		System.out.println("expression"+expression);
		
		try {
			for(int i = 0; i<expression.length();i++) {
				char ch = expression.charAt(i);
				if(ch == '(') {
					st.push(ch+"");  // 여는 괄호를 읽으면 스택에 집어넣는다
				}else if(ch == ')') {
					st.pop(); //닫는 괄호가 나오면 여는괄호를 하나씩 스택에서 꺼냄
				}
			}
			if(st.isEmpty()) {
				// 닫는괄호에 맞춰 여는게 스택에서 다나오면
				// 괄호의 개수가 일치한다
				System.out.println("괄호가 일치합니다");  
			}else System.out.println("괄호가 일치 x");
		}catch(EmptyStackException e){
			// 닫는 괄호가 더많아서 뺄게없으면 
			System.out.println("괄호가 일치 x");
		}
	}
	

}
