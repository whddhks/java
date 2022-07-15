package day10;
import java.util.*;
import javax.swing.*;
/*java collection framework
 *  - collection : 객체를 수집해서 저장하는 역할
 *  - framework  : 사용방법을 미리 정해놓은 라이브러리를 의미
 *  - (List계열)Vector, ArrayList,
 *  - (Map계열)Hashtable, HashMap, HashSet, TreeSet
 *  # Vector
 *  - list계열
 *  - 입력순서를 기억한다
 *  - 데이터 중복 저장 가능
 *  - 유사클래스 = ArratList
 *  - 채팅에 많이사용된다.
 * */
public class VectorTest {

	public static void main(String[] args) {
		//jdk1.4 이전버전
		//Vector v=new Vector();//초기용량 10개 가득차면 2배저장공간을 늘린다.
		Vector v=new Vector(5,3);//5초기용량 3증가치
		System.out.println("벡터 v의 현재 용량: "+v.capacity());
		System.out.println("벡터 v의 현재 크기: "+v.size());
		
		//데이터 저장 : add, addElement
		//데이터 꺼내기 : Object get(int index),Object elementAt(int index)
		v.add("hello");
		v.add(new Integer(20));//밑에 껄로 바뀜
		v.add(Integer.valueOf(22));
		v.add(3.14);//double리 저장되는것이 아니라 Double=>Wrapper class로 auto boxing되어 저장
		
		System.out.println("벡터 v의 현재 용량2: "+v.capacity());
		System.out.println("벡터 v의 현재 크기2: "+v.size());
		
		v.add(new Object());
		v.add(new javax.swing.JButton("OK"));
		
		System.out.println("벡터 v의 현재 용량3: "+v.capacity());
		System.out.println("벡터 v의 현재 크기3: "+v.size());
		
		//Object obj=v.get(0);
		String obj=(String)v.get(0);
		System.out.println(obj.toUpperCase());
		
		Double dbl=(Double)v.get(3);
		System.out.println(dbl);
		
		JButton str=(JButton)v.get(5);
		System.out.println(str);//str.toString()으로 출력한다
		//jdk5.0이후부터 Generic을 사용한다.
		//저장하는 유형을 지정한다.
		Vector<String> v2=new Vector<>();
		//String 유형만 저장하겠다.
		v2.add(new String("Java"));
		v2.add(Integer.valueOf(5).toString());
		
		String s2=v2.get(0);
		System.out.println(s2.toLowerCase());
		
		//[1] for루프 이용해서 v2에 저장된 객체를 출력하기
		
		//[2]float 유형을 저장할 벡터 v3를 생성하고
		//	 float 객체 3개 이상 저장하기
		//   확장 for루프문 이용해서 v3에 저장된 값들의 합계를 구해 출력하기
		
		for (int i=0;i<v2.size();i++) {
			System.out.println(v2.get(i));
		}
		Vector<Float> v3=new Vector<>();
		v3.add(3.11f); //float 를 Float로 auto boxing
		v3.add((float)5.334);
		v3.add(Float.valueOf(8.224f));
		float sum=0f;
		
		for (float a: v3) {//auto unboxing
			sum+=a;
			System.out.println(sum);
		}
		for (int i=0;i<v3.size();i++) {
			sum+=v3.get(i);
			System.out.println(sum);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
