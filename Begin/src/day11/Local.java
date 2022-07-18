package day11;
/*Local inner class 메스드 블럭 안에 클래스를 구성한 경우
 * 1 이름있는 로컬이너 클래스
 * 2 이름없는 로컬 이너 클래스
 * */
public class Local {
	String str= "멤버 변수 @@@" ; 
	
	
	public void sub() {
		double pi=3.14;//지역변수 (local var) //final이 되어버림 
		System.out.println(str);
		System.out.println(pi);
		class LocalInner{ //Local Inner class
			String lstr="localinner의 멤버변수###";
			void foo() {
				System.out.println(str);
				System.out.println(lstr);
				System.out.println(pi);//출력만가능
				//pi=5.12; //에러발생
				//로컬이너 클래스안에서는 final이 아닌 지역변수는  접근불가
			}
					
		}
		//로콜인너 클래스는 자기가 속한 메서드 안에서 객체생성해야 함
		//또한 클래스가 구성된 후어 객체생성이 다능함
		LocalInner li=new LocalInner();
		li.foo();
	}
	
	public static void main(String[] args) {
		//LocalInner의 foo()호출하기
		//Local의 sub()호출하기
		Local lo=new Local();
		lo.sub();
	}

}
