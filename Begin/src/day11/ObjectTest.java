package day11;
import java.util.*;

import day10.Student;

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
		
		Student st1=new Student(100,"김학생");
		Student st2=new Student(101,"이철수");
		Student st3=st2; //같은 객체를 가르켜라 라는 뜻
		Student st4=new Student(101,"이철수");
		
		System.out.println(st1);
		//==: 기본자료형일때 값을 비교, 참조형일 때는 주소값을 비교한다.
		System.out.println("st1==st2: "+(st1==st2));//다르다 false
 		System.out.println("st3==st2: "+(st3==st2));//같다 true
 		
 		//Object클래스의 equals() 메서드 : 주소값을 비교하여 같으면 true반호나
 		
 		System.out.println("st1.equals(st2)"+st1.equals(st2));//false
 		System.out.println("st3.equals(st2)"+st3.equals(st2));//truea
 		//st4,st2 비료
 		System.out.println("st2.equals(st4): "+st2.equals(st4));
 		//오버라이드 전에 false라고나옴
 		//오버라이드 하고나면 true 라고 나옴
 		//Student 클래스에서 equals()를 오버라이드 하세요
 		//id값과 name값이 같으면 true를 반환하도록 재정의 하세여
 		System.out.println("-----String 클래스 ------");
 		
 		String a1="Hello";//이 값을 넣는 방식이 리터럴
 		String a2="Hello";
 		String a3=new String("Hello");
 		String a4=new String ("Hello");
 		//a1==a2
 		//a1==a3
 		//a3==a4
 		System.out.println(a1==a2); //true
 		System.out.println(a1==a3);//false
 		System.out.println(a3==a4);//false
 		
 		
 		//equal() 문자열 내용비교
 		//a1.equals(a2)
 		//a1.equals(a3)
 		//a3.equals(a4)
 		System.out.println(a1.equals(a2));//true
 		System.out.println(a1.equals(a3));//false =>true
 		System.out.println(a3.equals(a4));//false =>true
 		
 		
		
		

	}

}
