package day13;
import java.io.*;
//System.in : 키보드와 노드를 연결
//System.out : 콘솔과 노드 연결
public class InputStreamTeset2 {

	public static void main(String[] args) throws IOException{
		int n=0;
		int cnt=0;
		System.out.println("입력하세요=>");
		//데이터를 배열에 담아서 읽고 써보자
		
		
		while((n=System.in.read())!=-1) {
			//Ctrl+C or +D 를 입력하면 -1반환
			System.out.write(n); //stream 을 쓰게되면 이걸쓰는게 좋음
			//System.out.println("n: "+((char)n));
			cnt++;
		}
		System.out.println(cnt+"bytes 읽음");
		
		System.in.close();
		System.out.close();

	}

}
