package day09;
interface Inter1{
	void a();
	 
}
interface Inter2{
	String b();
}
interface HisInter extends Inter1, Inter2 {
	String STR="Hellp";
}
abstract class AbsClass {
	abstract void c();
}
//인트페이스가 인터페이스를 상속 받을때는 extends 다중 상속도 가능하다.

/*1]MyClass2가 AbsClass 와 HisInter를 상속 받도록 하세요
 *  에러없게 처리하세여
 * */                                    


public class MyClass2 extends AbsClass implements HisInter {//해본결과 extends가 먼저나와야함
	
	public void a() {System.out.println("MyClass's Inter1");}
	
	public String b() {return "hello~~";}
	@Override
	void c() {System.out.println("MyClass's AbsClass");}

	public static void main(String[] args) {
		/* 2]MyClass2타입의 객체 생성해서 메서드 각각 호출하고 STR값도 출력해보기
		 * 3] HisInter타입의 변수 선언하고 MyClass2객체생성해서 메소드 각각 호출하고 STR값도 출력해보기
		 * 4] ABsClass타입의 변수 선언하고 MyClass2객체생성해서 메서드 각각 호출하고 STR값도 출력해보기
		 * */
		MyClass2 mc=new MyClass2();
		mc.a();
		mc.c();
		System.out.println(mc.b());
		System.out.println("-----------");
		
		AbsClass ac=new MyClass2();
		ac.c();

		((MyClass2)ac).a(); //가능
		
		
		HisInter hi=new MyClass2();
		hi.a();
		System.out.println(hi.b());
		System.out.println(HisInter.STR);
		System.out.println(MyClass2.STR);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}