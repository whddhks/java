package day09;
//final + 면수 : 값 할당을 할수 없게 함
//				public static final을 함께 사용
class MyFinal {
	final public static int NONE=1;
							int x=2;
}



public class FinalTest3 {

	public static void main(String[] args) {
		
		System.out.println(MyFinal.NONE);
		MyFinal mf=new MyFinal();
		System.out.println(mf.x);
		
		mf.x=20;
		System.out.println(mf.x);
		//MyFinal.NONE=10;
		
		
		

	}

}
