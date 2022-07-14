package day09;
//MyInter를 상속 받아서 에러나지 않게 처리해보기

public class MyClass implements MyInter, YourInter{
	public void Demo() { //접근 지정자 가 interface는 추상메소드는 무조거 public이 붙어있기때문에 상속역시 붙여여한다.
		System.out.println("Myclass's Demo()$$$$");
	}
	public int inter1() {
		return 100;
	}
	public void inter2(String s) {
		System.out.println(s.toUpperCase());
	}
	
	
	public static void main(String[] args) {
		
		
		
		MyInter mi=new MyClass();
		//인터페이스는 타입선언은 하수있으나
		//new해서 객체생성은 할수 없다.
		YourInter yi=new MyClass();
		
		//Demo()
		mi.Demo();
		System.out.println(((MyClass)mi).inter1());
		//inter1()
		int num=yi.inter1();
		System.out.println("num: "+num);
		//inter2()
		yi.inter2("good afternoon");
		//PI출력
		double d=yi.PI;
		System.out.println("PI: "+d);
		System.out.println(YourInter.PI);
		System.out.println(MyClass.PI);
		//MyClass.PI=5.11; 이렇게하면 final 변수는 변경 불가
	}

}
