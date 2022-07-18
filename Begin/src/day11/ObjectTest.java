package day11;
import java.util.*;

public class ObjectTest {

	public static void main(String[] args) {
		//java.lang.Object 클래스 : 모든클래스의 부모가 된다.
		Object o1=new Object();
		Object o2=new Object();
		System.out.println("o1 :"+o1);
		System.out.println("o1.toString() :"+o1.toString());
		/*toString()메서드는 해당객체레 대한 정보를 문자열로 반환한다ㅏ
		 * 재정의 하지 않았다면 "클래스이름@해시코드"로 반환한다.
		 * */
		String s1=new String("Hello");
		String s2=new String("Hello");
		System.out.println("s1 :"+s1);
		System.out.println("s1.toString(): "+s1.toString());
		
		//String클래스에서는 toString()을 오버라이드 하고있다.
		
		Date d1=new Date();
		System.out.println(d1);
		System.out.println("d1.toString():"+d1.toString());
		

	}

}
