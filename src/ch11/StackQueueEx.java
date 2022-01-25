package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); //Queue의 구현체인 LinkedList
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
	
		System.out.println("=Stack=");
		while(!st.empty()) { //비어있지 않으면 계속 pop
			System.out.println(st.pop());
			//후입선출이기 때문에 2,1,0 순서로 나온다
		}
		System.out.println("=Queue=");
		while(!q.isEmpty()) { //비어있지 않으면 계속 poll
			System.out.println(q.poll());
			//선입선출이기때문에 0 ,1 ,2 순서로 나온다
		}
	
	}
	

}
