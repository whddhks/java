package day10;
import java.util.*;
import java.io.*;
/*HashMap
 * 	- Map 계열
 *  - 무순서 (입력순서와 출력순서가 다를수 있음)
 *  - key값을 Set으로 관리한다.
 */
public class HashMapTest {
	HashMap<String, String> map= new HashMap<>();
	public void join() {
		map.put("Hong","123");
		map.put("Lee","abc");
		map.put("Admin","tiger");
		System.out.println(">>회원가입 완료 "+map.size()+"명 <<");
	}	
	public void loginCheck() {
		Console console=System.console();
		while(true) {
			System.out.print("아이디: ");
			String userid=console.readLine();
			//nullpointexception 이클립스에서 못함
			//System.out.println("userid: "+userid);
			
			if (!map.containsKey(userid)) {
				System.out.println("입력오류 아이디를 다시입력 하십시오");
				continue;
			}
			System.out.println("비밀번호를 입력하십시오");
			System.out.print("비밀번호: ");
			char[] pwd=console.readPassword();
			//==:기본자료형: 값을비교
			//	 참조형 :주솟값
			
			String realpwd=map.get(userid);
			//boolean equals(Object o) : String의 경우 문자열의 내용이 같으면 true
			if (!realpwd.equals(new String(pwd))) {
				System.out.println("비밀번호가 일치하지않습니다.");
				continue;
			}
			System.out.println(userid+"님 환영합니다.");
			break;
			//1] 입력한 아이디가 저장되어있는지 체크 
			//	1-1 없다면 입력오류 회원이 아닙니다.
			//	1-2 있다면 비밀번호입력
			//2]비밀번호가 맞는지 체크
			//	2-1 일치하는 경우는 ~~환영합니다.
			//	2-2 일치하지 않는경우 비밀번호가 일치하지 않아요
		}
		
	}
	public static void main(String[] args) {
		//join()을 호출
		HashMapTest hm=new HashMapTest();
		hm.join();
		hm.loginCheck();

	}

}
