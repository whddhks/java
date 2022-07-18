package day11;
import java.util.*;

/*TreeSet
 * - 추가된 데이터들이 정렬된다.
 * - 데이터중복은 허용하지 않는다.
 * - 내부적으로 이진(법) 트리를 사용해 데이터를 저장하고 꺼낸다.
 * */
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		tree.add("홍길동");
		tree.add("강감찬");
		tree.add("이순신");
		tree.add("정약용");
		tree.add("김철수");
		tree.add("홍길동");
		System.out.println("tree.size(): "+tree.size());
		
		for (String s: tree) {
			System.out.println(s);
		}
		//ㄱ~ㅎ순으로 나옴
		//정렬이 잘되어있어서 검색할때 쉽다.

	}

}
