package multicampus;
import java.util.*;
public class Teacher {
	int no;//교번
	String name;//이름
	String subject;//담당 과목
	String phone;//연락처

	//showInfo()
	public void showInfo2() {
		System.out.println("교   번 : "+no);
		System.out.println("이   름 : "+name);
		System.out.println("담당 과목 : "+subject);
		System.out.println("연 락 처 : "+phone);
	}
	//inputInfo()
	public void inputInpo2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("교번을 입력하십시오 : ");
		no=sc.nextInt();
		System.out.println("이름을 입력하십시오 : ");
		name=sc.next();
		System.out.println("담당교과을 입력하십시오 : ");
		subject=sc.next();
		System.out.println("연락처을 입력하십시오 : ");
		phone=sc.next();
	}
			
	
	
	
}
