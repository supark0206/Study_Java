package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx01 {

	//HashMap 이용해서 로그인
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId","1234");
		map.put("asdf","1111");
		//키가 같을경우 마지막에 넣은값으로 저장된다
		map.put("asdf","1234"); 
		System.out.println(map);
		
		Scanner s  = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID와 PW를 입력해주세요.");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			System.out.println();
			
			System.out.print("pw : ");
			String pw = s.nextLine().trim();
			System.out.println();
		
			if(!map.containsKey(id)) {
				System.out.println("입력한 id 존재 x 다시입력하세요");
				continue;
			}
			if(!(map.get(id)).equals(pw)){
				System.out.println("비밀번호가 일치하지 않습니다.");
				continue;
			}else {
				System.out.println("로그인 성공");
				break;
			}
		}
		
	}

}
