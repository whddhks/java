package day13;
import java.io.*;
/*FileReader
 * = 2byte(문자) 기반 스트림
 * = 노드 스트림 (파일과 노드 연결)
 * 
 * */
public class FileReaderTest {

	public static void main(String[] args) throws IOException{
		String fname= "C:\\myjava\\4조자바2.txt";
		//String fname="src/day13/InputStreamTeset2.java";
		File file=new File(fname);//파일 크기 알아볼때
		long fsize=file.length();//파일의 크기를 반환한다.
		System.out.println("파일크기:" +fsize+"bytes");
		
		FileReader fr=new FileReader(file);//노드 연결
		int n=0;
		while ((n=fr.read())!=-1) {
			System.out.write(n);
			System.out.flush();
			
		}
		fr.close();	

	}

}
