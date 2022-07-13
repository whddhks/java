package testfile;
import java.util.*;
public class Gittest3 {

	public static void main(String[] args) {
		//자음모음 스위치로 만들기 다른거 처리까지
		Scanner sc=new Scanner(System.in);
		System.out.println("알파벳을 입력하세요");
		char ch=' ';
		ch=sc.next().charAt(0);
		if ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
			switch(ch) {
			case 'a','e','i','o','u','A','E','I','O','U':
				System.out.println(ch+"은/는 모음입니다.");
				break;
			default:
				System.out.println(ch+"은/는 자음입니다.");
				break;
			}
		
		}else
			System.out.println(ch+"은/는 없는 글자입니다.");
		
		
		
		

	}

}
