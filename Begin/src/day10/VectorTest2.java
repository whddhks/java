package day10;
//java.util.list 계열 =>List[]
import java.util.*;
public class VectorTest2 {

	public static void main(String[] args) {
		//학교의 경우 신입생이 게속 들어오므로 Vector로 만든다.
		//[1] Student 객체를 3개 생성하세요
		//[2] Student를 저장할 Vector를 생성하세요
		//[3] 벡터에 학생객체 3개를 저장하세요
		//[4] for루프 를 이용해서 벡터에 저장된 학생의 정보를 출력하세효
		
		Student st1=new Student(1,"김벡터");
		Student st2=new Student(2,"이벡터");
		Student st3=new Student(3,"박벡터");
		
		Vector<Student> v1=new Vector<>(3,2);
		v1.add(st1);
		v1.add(st2);
		v1.add(st3);
		System.out.println(v1.size());
		for (Student a:v1) {
			System.out.println("학번 : "+a.getId()+"\t이름 : "+a.getName());
		}
		//public Enumeration<E> elements()
		//public Iterator<E>	iterator()
		/*Enumeration<E> elements()
		 * : 벡터에 저장된 객체들을 한꺼번에 꺼내오고자 할 때 사용.
		 * Enumeration과 Iterator인터페이스는 객체들을 집합체로
		 * 관리하도록 해주는 인터페이스이다.
		 * 이들 인터페이스에서는 각각의 객체들을 한 순간에 하나씩
		 * 처리할 수 있는 메소드를 제공한다.
		 * # Enumeration의 경우**********************************
		 * 	- boolean hasMoreElements() : 논리적 커서(첫번째 요소 직전에
		 * 				위치) 이후에 요소들이 있는지 물어서 있으면true 반복문안으로
		 * 				없으면 false를 반환
		 *  - E nextElement(): 논리적 커서를 다음 요소로 이동하고
		 *  			현재 가리키고 있는 요소를 반환한다.
		 *  
		 * # Iterator의 경우**************************************
		 * 	- boolean hasNext()
		 *  - E next() 
		 * */
		Iterator<Student> it=v1.iterator();
		while (it.hasNext()) {
			Student i=it.next();
			System.out.println(i.getName()+": "+i.getId());
		}//이걸 더많이사용한다.
		/*
		Enumeration<Student> en= v1.elements();
		//en은 집합체 형태를 가리키고 있다.
		while(en.hasMoreElements()) {
			Student e=en.nextElement();
			System.out.println(e.getName()+": "+e.getId());
		}
		
		//엘리베이터타는느낌 계속 다음다음하다가 다음층없으니까 내리는느낌
		System.out.println("******************");
		while(en.hasMoreElements()) {
			Student e=en.nextElement();
			System.out.println(e.getName()+": "+e.getId());
		}
		//다시 반복문 써도 논리적 커서가 없는곳을 가리키기때문에 안나온다.
		
		*/
		//clear() removeAll() : 모든용소를삭제한다.
		v1.clear();
		System.out.println("모두 삭제한다.~~~~~~~");
		it=v1.iterator();
		for(;it.hasNext();) {
			Student i=it.next();
			System.out.println(i.getName());
		}
		
		

	}

}
