package testfile;
class A {
	public int getVar() {
		return 5;
	}
}
class B extends A{
	
	public int getVar() {
		return 10;
	}
}
public class Test4 {

	public static void main(String[] args) {
		B b=new B();
		A a=(A)b;
		int x = a.getVar();
		System.out.println(x);
		char cha='1';
		char cha2='2';

		System.out.println('1'+'2');
		
		

	}

}
