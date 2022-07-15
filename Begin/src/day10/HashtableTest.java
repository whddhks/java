package day10;
/*Map계열- Hashtable, HashMap, Properties
 * - Object유형을 저장할 수 있으며
 * - key와 value를 매핑하여 저장한다.
 * - 데이터가 75% 차면 자동으로 저장 영역을 확대한다.
 * - key값의 중복을 허용하지 않는다.
 * - 무순서
 * - 데이터 저장: Object put(Object key, Object val)
 * - 데이터 추출: Object get(Object key) 
 * */
import java.util.*;
public class HashtableTest {

	public static void main(String[] args) {
		Hashtable<String, Integer> h1=new Hashtable<>();
		//key Sering value Integer
		h1.put("생년", 2012);
		h1.put("나이", Integer.valueOf(20));
		h1.put("연봉", 5000);
		h1.put("나이", 30	);
		
		//map계열은 검샏이 용이하다
		Integer age=h1.get("나이");
		System.out.println("age: "+age+"세");
		//밑에 같은 Key값에 다른 value값이 있으면 나중에 저장된값으로 덮어쓴다.
		//Enumeration<K>  keys() 키값드마 Enumeration 객체로 반환함 
		//키값들 추출해서 출력한귀 value도 같이 출력해보기
		Enumeration<String> em=h1.keys();
		for(;em.hasMoreElements();) {
			String key= em.nextElement();
			System.out.println(key+">>"+h1.get(key));
		}
		//Set<K> keyset() 키 값들만 Set객체로 반환
		Set<String> set=h1.keySet();
		for (String ky :set) {
			System.out.println(ky);
		}
		
		//Collection<V> values() value값만 반환
		Collection<Integer> co=h1.values();
		for (Integer va:co) {
			System.out.println(va);
		}
		//boolean	containsKey();
		//key값을 포함하고있으면 true 없으면 false 
		//boolean	containsValue();
		//value 값을 포함하고있으면 true 없으면 false
		//지정한 값이 있으면 true 없으면 false
		System.out.println(h1.containsKey("생년"));
		System.out.println(h1.containsValue(2013));

		
		
		
		
		
		
		
		
		
		

	}

}
