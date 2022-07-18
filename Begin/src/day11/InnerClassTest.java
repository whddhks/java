package day11;



public class InnerClassTest {
	//1) Outer클래스의 a,b변수값을 출력하세요

	//2) Inner클래스의 c변수값 출력하고

	//	sub()메소드 호출하기

	//3) SInner클래스의 d 출력

	//	foo(), bar()호출하기
	//인너클래스끼리의 지역메소드의 지역변수는 가져올수없다.
	
	public static void main(String[] args) {
		Outer o1=new Outer();
		System.out.println(o1.a);
		System.out.println(Outer.b);
		
		Outer o2=new Outer();
		Outer.Inner oi= o2.new Inner();
		//잘바라 new가 뒤에있다 잘보라고 제일어렵다 이게
		System.out.println(oi.c);
		oi.sub();
		
		//Outer.inner oi2=new Outer().new inner(); 한줄로 줄인것
		
		
		Outer.SInner os= new Outer.SInner();
		System.out.println(os.d);
		System.out.println(Outer.SInner.e);
		os.foo();
		Outer.SInner.bar();
	
		
		

	}

}
