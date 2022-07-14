package day09;
class SuperDemo{
	void sub() {
		System.out.println("SuperDemo's sub()");
	}
	final void bar() {
		System.out.println("SuperDemo's bar()");
	}
}
class SubDemo extends SuperDemo{
	@Override
	void sub() {
		System.out.println("sub() @@@@");
	}
	/*
	@Override
	final void bar() {
		System.out.println("bar() @@@@");
	}
	//final + method 오버라이딩을 할수없다
	*/
	
}
public class FinalTest2 {

	public static void main(String[] args) {
		SuperDemo sd=new SuperDemo();
		sd.sub();
		sd.bar();
		
		SubDemo sb=new SubDemo();
		sb.sub();
		sb.bar();

	}

}
