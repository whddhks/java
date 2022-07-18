package day11;
import java.util.*;
/*Set 계열
 * - 순서를 기억하지 않는다
 * - 데이터 중복을 허용하지 않는다
 * - 구현 클래스 : HashSer, TreeSet
 * - HashSet은 객체를 저장하기 전에 객체의 Hashcode()를 호출해서
 * 		해쉬코드를 얻어 내고 이미저장되어있는 객체들의 해시코드롸 비교한다,
 * 		만약 동일한 해쉬코드가 있다면 다시 equals()메서드로 두객체를 비교해서
 * 		true가 나오면 동일한 객체로 판단하고 중복저장을 하지않는다. 
 * */
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		//add(T) 저장
		set.add("JAva");
		set.add("HTML");
		set.add("CSS");
		set.add("Python");
		set.add("MySQL");
		set.add("JAva");
		System.out.println("set.size() :"+set.size());
		//같은 값이 있으니까 덮어 씀
		
		
		//꺼내기 (get이 없음)
		//Iterator<E> iterator
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String val=it.next();
			System.out.println(val);
		}
		//순서대로 나오지 않음
		
		set.remove("CSS");
		System.out.println(set.size());
		
		for (String str:set) {
			System.out.println(str);
		}
		
		
		set.clear();
		System.out.println("set.size() :"+set.size());
		
		
			
		

	}

}
