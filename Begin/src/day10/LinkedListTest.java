package day10;
import java.util.*;
/*LinkedList :인접한 참조를 링크해서 체인처름 관리하는 컬렉션
 * 				데이터를 젖장한 후 수시로 데이터를 삽입하거나 삭제, 수정해야 할경우 적합
 * ArrayList : 순차적으로 데이터를 저장할때 작합함 검색할때 상대적으로 빠름
 * */
public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		List<String> list2=new LinkedList<>();
		
		long startTime= System.nanoTime();
		for (int i=0;i<100000;i++) {
			list1.add(0,"HEllo "+i);
			//0번쨰에 계속밀어넣고 있음
			//
		}
		long endTime=System.nanoTime();
		
		long gapTime= endTime-startTime;
		System.out.println("***ArrayList 걸린시간: "+gapTime+"초" );
		System.out.println("list1.size(): "+list1.size());
		System.out.println("***********************************");
		
		startTime= System.nanoTime();
		for (int i=0;i<100000;i++) {
			list2.add(0,"HEllo "+i);
		}
		endTime=System.nanoTime();
		
		gapTime= endTime-startTime;
		System.out.println("***LinkedList 걸린시간: "+gapTime+"초" );
		/**
		 * 			순차적으로 추가,삭제	|중간에 삽입, 삭제		|검색
		 * ArrayLsit	빠르다			느리다				빠르다
		 * LinkedLsit	느리다			빠르다				느리다
		 * */
	
	}
	

}
