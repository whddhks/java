package day02;

public class Test {

	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("1"+"2");// 12
		System.out.println(true+ "");//true
		System.out.println('A' + 'B');//65+66= 131
		
		System.out.println('1'+2);//char + int =>int : 49+2=51
		
		System.out.println('1'+'2');//99
		
		System.out.println('J'+"ava");//char+String=>String
		
		System.out.println(true+"null");//boolean+String=>String
		
		char ch='A';
		byte b=10;
		int i=100;
		
		ch=(char)b;
		short s=(short)ch;
		i=ch;
		char ch2=' ';


	}

}
