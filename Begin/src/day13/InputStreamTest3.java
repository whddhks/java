package day13;
import java.io.*;
public class InputStreamTest3 {

	public static void main(String[] args) throws IOException{
		int n=0;
		int cnt=0;
		System.out.println("입력하세요=>");
		//데이터를 배열에 담아서 읽고 써보자
		
		byte[] arr=new byte[6];
		int total = 0;
		while((n=System.in.read(arr))!=-1) {
			//배열arr에 데이터가 담긴다.
			//n: 달걀갯수(바이트)
			
			//System.out.write(n); 바이트읽기
			System.out.write(arr,0,n);
			System.out.flush();//스트림에 남아있는 데이터를 밀어내기 해줌
			cnt++;//반복수
			total+=n;
		}
		//
		System.out.println(cnt+"반복수");//배열로해버리면 바이트가아님
		System.out.println(total+"bytes 읽음");
		System.in.close();
		System.out.close();

	}

}
