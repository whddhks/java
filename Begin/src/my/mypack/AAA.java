package my.mypack;
//페키지 선언문 :제일 첫문장으로 기술해야한다.
//패키지명과 디렉토리명은 대소문자까지 똑같아야한다.

public class AAA {
	public static void main(String [] args) { //public클래스 : 어디서든지 접근 가능한 지정자
		BBB b=new BBB();
		b.funcB();
		AAA a=new AAA();
		a.funcA();
		
		
		
	}
	
	public void funcA() {
		System.out.println("AAA");
	}
	

}
class BBB { //생략형 지정자 public없음(default 지정자, package지정자):
	public void funcB() {
		System.out.println("BBB");
	}
}