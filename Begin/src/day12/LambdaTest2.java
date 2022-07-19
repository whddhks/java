package day12;
@FunctionalInterface
interface MyFunc {
	void func();
}
@FunctionalInterface
interface YourFunc {
	void foo(int x);
}

//매개변수를 받아 값을 반환하는 람다식
@FunctionalInterface
interface HerFunc {
	String makeStr(String a, String b);
	
}

public class LambdaTest2 {

	public static void main(String[] args) {
		//[1] 람다식 ###을 출력하는 람다식을 구현한뒤에 함수를 호출해보세요
		MyFunc m1=()->System.out.println("###");
		m1.func();
		//[2] 람다식 \\(^^)//출력하는 람다식 구현하고 함수 호출
		MyFunc m2=()-> System.out.println("\\\\(^^)//");
		m2.func();
		//[3]YourFunc 매개변수를 받으면 거듭제곱값을 출력하는 람다식 구현한 뒤 함수 호출하기
		YourFunc y1=x->System.out.println(x*x);
		y1.foo(10);	
		//[4]YourFunc 매개변수에서 4을 뺴주는 값을 출력하는 람다식 구현한 뒤 함수 호출하기
		YourFunc y2=x->System.out.println(x-4);
		y2.foo(50);
		//[5]HerFunc ㅁ누자열 2개를 받아서 2개의 문자열을 연결해서 반환하는 람다식 호풀
		HerFunc hf=(a,b)->a+b;
		System.out.println(hf.makeStr("hello", "world"));
		//[6]연결해서 반환하데 첫글자는 대문자로 나머지는 소문자로 구현
		//hello+world
		HerFunc hf2=(a,b)->{
			char c1=a.charAt(0);
			char c2=b.charAt(0);
			String s1=a.substring(1);
			String s2=b.substring(1);
			
			String allStr=(c1+"").toUpperCase()+s1+" "+String.valueOf(c2).toUpperCase()+s2;
			return allStr;//뭔말이야?
		};
		System.out.println(hf2.makeStr("hello", "world"));
		
		
		

	}

}
