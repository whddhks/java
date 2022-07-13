package testfile;
import java.util.*;
public class Gittest4 {

	public static void main(String[] args) {
		//for문 
		//1부터 100까지의 정수중에서
		//3또는 4의 배수의 합을 구하자
		int sum=0;
		for (int i=0;i<101;i++) {
			if (i%3==0 || i%4==0) {
				sum=sum+i;
			}
		}System.out.println(sum);
		
		/*while문
		 * 정수를 입력받는다 개수 제한없다
		 * 0을입력하면 입력 종료
		 * 입력한수의 개수를 출력
		 * 평균출력
		 * */ 
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int i=0;
		int sum2=0;
		int count=0;
		while((i=sc.nextInt())!=0) {
			sum2=i+sum2;
			count++;
		}
		System.out.println(count);
		System.out.println(sum2/count);
		

	}

}
