package testfile;

public class Test3 {

	public static void main(String[] args) {
		int x=21;
		if (x>10 && x<20) {
			System.out.println(true);
		}else 
			System.out.println(false);
		char ch='a';
		if (ch!=' ' || ch!='\t') {
			System.out.println(true);
		}else
			System.out.println(false);
		if(ch=='x' || ch=='y') {
			System.out.println(true);
		}else
			System.out.println(false);
		if (ch>='0' || ch<='9') {
			System.out.println(true);
		}else
			System.out.println(false);
		if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			System.out.println(true);
		}System.out.println(false);
		
		int year=0;
		if (year%400==0 || year%4==0 && year%100!=0) {
			System.out.println(true);
		}System.out.println(false);
		
		boolean powerOn=false;
		if (powerOn==false) {
			System.out.println(true);
		}System.out.println(false);
		
		String str=new String("yes");
		if (str=="yes") {
			System.out.println(true);
		}System.out.println(false);
		
		int sum=0;
		for (int i=0;i<21;i++) {
			if(i%2!=0 ||i%3!=0) {
				sum=i+sum;
			}
		}System.out.println(sum);
		
		sum=0;
		int totalSum=0;
		for (int i=0;i<11;i++) {
			sum=i+sum; //sum+=i;
			totalSum=totalSum+sum; //totalSum+=sum;
		}
		System.out.println(totalSum);
		
		
		
		

	}

}
