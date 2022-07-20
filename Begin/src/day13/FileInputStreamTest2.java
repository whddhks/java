package day13;
import java.io.*;
public class FileInputStreamTest2 {
/*FileInputStream
 * 1byte 기반 스트림
 * node 스트림 => 파일과 노드 연결한다.
 * 이미지, 멀티미디어, 바이너리 파일 등을 읽을때 사용한다.
 * 
 * */
	public static void main(String[] args) throws IOException {
		//String fileName="src/day13/InputStreamTeset2.java";
		//String fileName2="C:/myjava/InputStream_Copy.txt";
		String fileName="awdawd.PNG";
		String fileName2="c:/myjava/Copy.PNG";
		
		//파일과 노드 연결
		FileInputStream fis =new FileInputStream(fileName);
		FileOutputStream fos=new FileOutputStream(fileName2);
		int n=0;
		int cnt=0;
		int total=0;
		byte[] arr=new byte[1024];
		while((n=fis.read(arr))!=-1) {//n: 파일데이터가 담긴다.
			//파일의 끝에 도달하면 -1을 반환한다.
			//System.out.write(arr,0,n);
			//System.out.flush();
			fos.write(arr,0,n);
			fos.flush();
			//cnt++;
			//total+=n;
		}
		System.out.println("반복 횟수 : "+cnt+"회 반복함");
		System.out.println("총 파일 크기 : "+total+"bytes");
		System.out.println(fileName2+"에 카피완료!");
		fis.close();
		fos.close();
		System.out.close();

	}

}
