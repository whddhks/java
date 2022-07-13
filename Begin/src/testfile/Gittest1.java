package testfile;
import java.util.*;
public class Gittest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int level=0;
		do {
			System.out.println("-----학년을 입력하세요-----");
			level=sc.nextInt();
			System.out.println(level+"학년 입니다.");
			System.out.println("---점수를 입력하세요---");
			float score=sc.nextFloat();
			
			if (score>100 || score<0) {
				System.out.println("100점이 넘거나 0점보다 낮은 점수는 다시입력해주세요");
				continue;
			}
			if (level<=3) {
				if (score<60) {
					System.out.println("'불합격'입니다.");
			}else 
					System.out.println("'합격'입니다.");
			}
			if (level>=4) {
				if(score<70) {
					System.out.println("'불합격'입니다.");
			}else
				System.out.println("'합격'입니다.");
			}
		}while (level!=9);
			System.out.println("졸업쫌 하세요");
		//점수입력 0~100
		//학년입력
		//60점이상이면 합격
		//60점미만 불합격
		//4학년이일경우 70점이상 합격

	}

}
