package day11;

class MyObject extends Object{
	@Override
	public String toString() {
		return "I am Myobject";
	}
}

public class AnonymousClassTest {

	public static void main(String[] args) {
		Object o1=new Object();
		Object o2=new Object() {
			@Override
			public String toString() {
				return "Anonymous Object";
			}
		};//{}가 이름없는 로컬이너 클래스 ;은 필수
		
		System.out.println(o1);//이렇게하면 toString 값이 나온다
		System.out.println(o1.toString());
		
		Object o3=new MyObject();
		System.out.println(o3);
		System.out.println(o2);
		//오버라이드 하면 오버라이드한 값이 나옴

	}

}
