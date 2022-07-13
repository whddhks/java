package testfile;
import java.util.*;
public class Gittest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("----월을 입력하세요----");
		int month=0;
		month=sc.nextInt();
		if (month>=1 && month<=12) {
			switch(month) {
			
			case 1, 12, 2 :
				System.out.println("겨울입니다.");
				break;
			case 3, 4, 5 :
				System.out.println("봄입니다.");
				break;
			case 6, 7, 8 :
				System.out.println("여름입니다.");
				break;
			case 9, 10, 11 :
				System.out.println("가을입니다.");
				break;
				}
		}else
			System.out.println("없는 월 입니다.");
		//switch case문
		//월 입력해서 
		//계절
		//12 ,1,2 겨울
		//3,4,5 봄  
		//6,7,8 여름
		//9,10,11 가을 
		
		

	}

}
