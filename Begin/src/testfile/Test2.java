package testfile;

public class Test2 {

	public static void main(String[] args) {
		//양수음수0 출력 코드
		//삼항연산자 2번 넣어라
		int i=0;
		String result=(i>0)? "양수입니다." : "음수입니다.";
		String result2=(i!=0)? "0이 아닙니다.":"0입니다.";
		System.out.println(result);
		System.out.println(result2);
		
		
		
		int a=456;
		System.out.println((a/100)*100);
		//인트값은 소숫점이 안남기때문에 100으로 나눈뒤 다시 100으로 곱하면 된다.

	}

}
