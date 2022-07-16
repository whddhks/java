package multicampus;
import java.util.*;
public class School {
	//School has a students[배열]
	//String[] arr=new String[3]; [x]
	static Student[] arr=new Student[3];//배열 => DB같은 역할을 함
	static int count=0;//배열의 인덱스 번호로 사용할 변수
	static Teacher[] arr2=new Teacher[3];
	static int count2=0;
	
	
	public static void showMenu() {
		System.out.println("**** SchoolApp v1.1******");
		System.out.println("**     1. 등    록      **");
		System.out.println("**     2. 출    력      **");
		System.out.println("**     3. 검    색      **");
		System.out.println("**     4. 삭    제      **");
		System.out.println("**     9. 종    료      **");
		System.out.println("*************************");
		System.out.println("메뉴 번호를 입력하세요 =>");
		System.out.println("*************************");
	}
	
	public static void register() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.학생 정보 등록 / 2.교사 정보 등록");
		/*학생 교사 선택 12나누고
		 * 정보 입력 및 등록1만 2개이쓰면 된다
		 * */
		int num=sc.nextInt();
		if (num==1) {
			Student s1=new Student();
			s1.inputInfo();
			System.out.println("-----등록한 학생 정보-----");
			s1.showInfo();
			System.out.println("입력한 학생 정보를 저장할까요? [1. yes 2. no]");
			int num2=sc.nextInt();
			if(num2==1) {
				//s1을 배열에 저장한다==> arr에 저장하기
				arr[count]=s1;
				count++;
				System.out.println(count+"명 등록 했습니다!!");
			}
		}else if (num==2) {
			Teacher tc=new Teacher();
			tc.inputInpo2();
			System.out.println("-----등록한 교사 정보-----");
			tc.showInfo2();
			System.out.println("입력한 교사 정보를 저장할까요? [1. yes 2. no]");
			int num3=sc.nextInt();
			if (num3==1) {
				arr2[count2]=tc;
				count2++;
				System.out.println(count2+"명 등록 완료하였습니다.");
			}
		}
		
		
		
		
		
	}//-------------------------------

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		do {
			//showMenu()호출하기
			School.showMenu();
			num=sc.nextInt();
			//메뉴에 없는 번호를 입력했을 경우 "메뉴에 없는 번호에요. 다시 입력하세요"
			if((num <= 0) || (num > 4 && num !=9)) {
				System.out.println("메뉴에 없는 번호입니다. 다시 입력하세요.");
				continue;
			}
			switch(num) {
			case 1: //학생 등록===> register()메소드 호출하기
				School.register();
				break;
			case 2: //출력 printAll()==> arr에 저장된 학생들의 정보를 
					//반복문 돌면서 출력한다
				break;
			case 3://검색
				break;
			case 4://삭제	
				break;
			}
		}while(num!=9);
		System.out.println("잘가세요~~");

	}

}
