package my.yourpack;


//import my.mypack.AAA;
//import my.mypack.BBB;
import my.mypack.*;

public class FFF {

	public static void main(String[] args) {
		
		AAA a=new AAA(); //AAA: 접근지정자 public 이 있다
		a.funcA();
		
		//BBB b=new BBB(); //생략형 접근지정자를 가진 클래스. 같은 패키지만 접근가능
		//b.funcB();
		//도스로 실행 class 최상단인 bin에서 시작하며 
		//java.패키지명.클래스명 하면 실행된다.

	}

}
