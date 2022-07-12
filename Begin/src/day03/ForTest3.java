package day03;
//중첩 for루프문
public class ForTest3 {

	public static void main(String[] args) {
		for(int i=2;i<4;i++)
		{
			for(int k=1;k<3;k++)
			{
				System.out.println("i="+i+", k="+k);
				
			}//for----
			System.out.println("****************");
			
		}//for-----------------
		
		/*문제1] 중첩 for루프를 이용해서 아래 모양이 출력되도록 해보세요
		 * ★★★★★ 
		 * ★★★★★
		 * ★★★★★
		 * 
		 * */
		for(int k=1;k<4;k++) {
			for(int i=1;i<6;i++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
		
		/*문제2] 중첩 for루프 이용해서 구구단 전체를 아래 형태로 출력하세요
		 * 2x1=2	3x1=3	4x1=4 ...		9x1=9
		 * 2x2=4	3x2=6	...
		 * 
		 * 2x9=18   3x9=27
		 * */
		for(int i=1;i<10;i++) {//행의 조건
			for(int k=2;k<10;k++) {//열의 조건
				System.out.print(k+"x"+i+"="+k*i+"\t");
			}//for----
			System.out.print("\n");
		}//for-------------------
		

	}

}




