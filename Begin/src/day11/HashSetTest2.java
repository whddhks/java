package day11;
import java.util.*;
public class HashSetTest2 {

	public static void main(String[] args) {
		//member객체 3개 생성 Hashset하나 생성하고 저장
		//iterator 메소드로 회원정보 출력
		Member mb=new Member("김회원",20);
		Member mb2=new Member("이회원",30);
		Member mb3=new Member("박회원",40);
		Member mb4=new Member("김회원",20);
		Member mb5=new Member("김회원",33);
		//중복저장을 막지만 된다? 만든다고 다막지는 못한다.
		//막으려면 해시코드 이퀄즈를 오버라이드 해서 동일인물인지 확인해야한다.
		
		HashSet<Member> hs=new HashSet<>();
		hs.add(mb);
		hs.add(mb2);
		hs.add(mb3);
		hs.add(mb4);
		hs.add(mb5);
		Iterator<Member> it=hs.iterator();
		while(it.hasNext()) {
			Member val=it.next();
			
			System.out.println("회원 이름:"+val.name+"\t회원 나이:"+val.age);
			
		}
		
		System.out.println("mb.hashcode(): "+mb.hashCode());
		System.out.println("mb4.hashcode(): "+mb4.hashCode());
		System.out.println("mb2.hashcode(): "+mb2.hashCode());
		
		

	}

}
