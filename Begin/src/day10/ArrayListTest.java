package day10;
import java.util.*;
/*ArrayList 는 java.util.List계열
 *  - Vector와 기능은 동일
 *  - 단 벡터는 멀티 쓰레드가 동작하는 환경일때 동기화가 구현 되어있어  //쪼금이라도 빠르면 먼저함
 *  	조금이라도 먼저 저장한 객체가 순차적으로 저장되는 반면,
 *  	ArrayList는 동기화가 구현되어 있지 않는다  			 //쪼금차이는 무시함
 *LinkedList : List 계열
 *	ArrayList는 순차적 데이터 저장할때 적합,
 *			   중간에 삽입 또는삭제 ==>적합하지 않음
 *	
 * */
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<>();
		//Object유형을 저장 저장영역을 자동으로 확대한다.
		arrList.add("하이");
		arrList.add("반가워요");
		arrList.add("^^");
		System.out.println("arrList.size() : "+arrList.size());
		
		//Iterator<E>
		
		Iterator<String> it=arrList.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
		
		String s2=arrList.get(2);
		System.out.println(s2);
		
		List<Integer> arrList2=Arrays.asList(40,10,20,4);
		for(Integer a: arrList2) {
			System.out.println(a);
		}
		//Collections.sort() 메서드이용하면 정렬가능
		//Collections.sort(arrList2);//기본이 오름차순
		Collections.sort(arrList2, Collections.reverseOrder());
		System.out.println("-----정렬 이후-----");
		
		for(int i=0;i<arrList2.size();i++) {
			System.out.println(arrList2.get(i));
		}
		
		arrList.remove(0);
		System.out.println("---0번째 삭제이후---");
		for(String val:arrList) {
			System.out.println(val);
		}
		//arrList2는 삭제가 안된다
		//List<E> arr=new ArrayList<E>(); ==>동적인 컬렉션 생성 (데이터 추가삭제가능)
		//List<E> arr=Arrays.asList(E,E,E,E.....); ==>정적인 컬랙션 생성(데이터 추가 삭제 불가능)
		
		
		
		
		
		
	}
	
	
	

}
