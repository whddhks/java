package day13;
import java.io.*;
/*FileReader들이고//FileWriter내보네고
 * = 2byte(문자) 기반 스트림
 * = 노드 스트림 (파일과 노드 연결)
 * 
 * */
public class FileReaderTest {

	public static void main(String[] args) throws IOException{
		//String fname= "C:\\myjava\\4조자바2.txt";
		
		String fname="src/day13/InputStreamTeset2.java";
		File file=new File(fname);//파일 크기 알아볼때
		File file2=new File("C:/myjava/4java3.txt");
		long fsize=file.length();//파일의 크기를 반환한다.
		System.out.println("파일크기:" +fsize+"bytes");
		
		FileReader fr=new FileReader(file);//노드 연결
		
		
		FileWriter fw=new FileWriter(file2, true);
		//true를 주면 기존 파일 내용을 덮어쓰기가 아니라 덭붙여쓰기한다.
		int n=0;
		char[] data=new char[1000];
		while ((n=fr.read(data))!=-1) {
			fw.write(data,0,n);
			fw.flush();
			//System.out.write(n);
			//System.out.flush();
			
		}
		fr.close();	

	}

}
