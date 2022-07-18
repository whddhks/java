package day11;

public class StirngTest {

	public static void main(String[] args) {
		//java.lang.String : final클래스 상속받을수 없다
		//					immutable(불변성) : 문자열 결합니다 상제 수정등의
		//					작업할때 원본문자열은 그대로 두고 새로 생성함
		
		String s1="java";
		s1+=" Language";
		System.out.println(s1);
		
		/*s1------->"Java"
		 * 
		 *s1------->"Java Language"
		 *
		 * 웹프로그램을 쓸때는 String잘 안씀 랙걸림
		 * */
		
		//concat(): 문자열을 결합 
		String s2=s1.concat(" Nice");
		System.out.println(s1);
		System.out.println(s2);
		
		//char charAt(int i)
		char c1=s1.charAt(5);
		//Java Langu a g e
		//0123456789101112
		
		System.out.println(c1);
		
		String s3="5678";
		boolean isNumber=true;
		for(int i=0;i<s3.length();i++) {
			char ch=s3.charAt(i);
			System.out.print(ch+", ");
			if (!(ch>='0'&&ch<='9')) {
				isNumber=false;
				break;
				//숫자가 아닌 문자가 있다면
			}
			
		}
		
		String result=(isNumber)? "숫자입니다.":"숫자가 아닙니다.";
		System.out.println("\n변수 s3는 "+result);
		
		//int indexOf(String str): str문자열이 위치한 곳의 index번호를 반환한다.
		//							만약 str문자열이 없다면 -1을 반환한다.
		String s4="어머니는 짜장면이 싫다고 하셨어, 어머님은 짜장면이....";
		int idx=s4.indexOf("짜장면");//문자열 앞에서 부터 찾는다
		System.out.println("idx: "+idx);//5
		
		//int lastIndexOf(String str) : 문자열 뒤에서 부터 찾음
		idx=s4.lastIndexOf("짜장면");
		System.out.println("idx: "+idx);//맨뒤의 짜장면 찾음
		
		idx=s4.indexOf("짬뽕");
		System.out.println("idx: "+idx);//없어서 -1나옴
		
		//String substring(int start,int end) : 인데스 start에서 부터 
		//										end-1까지의 문자열을 반환한다.
		
		//String substring(int start):처음부터 끝까지
		System.out.println(s4.substring(s4.indexOf("짜장면"),s4.lastIndexOf("짜장면")));
		System.out.println(s4.substring(5));
		System.out.println(s4);
		
		//replace(String oldStr,String newStr)//올드를 뉴로 반환
		System.out.println(s4.replace("짜장면","짬뽕"));
		System.out.println(s4);
		
		String s5="		100#Tom#반갑습니다.~오늘도 즐거운 하루 되세여		";
		System.out.println("s5.length(): "+s5.length()+" "+s5);
		//trim() : 문자열 앞 뒤의 공백문자를 제거한다.
		String s6=s5.trim();
		System.out.println("s6.length(): "+s6.length()+" "+s6);
		//String toUpperCase/toLowerCase
		
		//String[] split(String regex): 특정패턴 문자열을 기준으로 문자열을 쪼개어 배열에 담아 반환한다.
		String[] tokens=s5.split("#");//중요하다
		System.out.println("tokens.lenght: "+tokens.length);
		//100 tom 문자 이렇게 3개
		System.out.println("tokens[0]= "+tokens[0]);
		System.out.println("tokens[1]= "+tokens[1]);
		System.out.println("tokens[2]= "+tokens[2]);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
