package testfile;

public class Test1 {

	public static void main(String[] args) {
		/*System.out.println("1"+"2");
		System.out.println(true+"");
		System.out.println('A'+'B');
		System.out.println('1'+2);
		System.out.println('1'+'2');
		System.out.println('J'+"ava");
		//System.out.println(true+null);
		
		//해설
		System.out.println("--------------");
		System.out.println("1"+"2");// 12 문자로만 나옴
		System.out.println(true+ "");//true 공백
		System.out.println('A' + 'B');//65+66= 131 char형식 아스키코드
		
		System.out.println('1'+2);//char + int =>int : 49+2=51
		
		System.out.println('1'+'2');//99
		
		System.out.println('J'+"ava");//char+String=>String
		
		System.out.println(true+"null");//boolean+String=>String
										//null은 String의 기본
		*/
		char ch='A';
		byte b=10;
		int i=100;
		long l=1000L;
		
		b=(byte)i;
		ch=(char)b;
		short s=(short)ch;
		i=(int)ch;
		char ch2=' ';
		float f=(float)l;
		
		//형변환은 자기보다 큰놈으로는 못한다.
		
		
		

	}

}
