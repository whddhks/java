package day13;
import java.io.*;
/*InputStreamReader
 * = 2byte(문자) 기반 스트림
 * = 브릿지 스트림
 * 1byte로 읽어드린 데이터를 2byte로 조합하새 읽어들인다.
 * charset을 맞투는 기능이 있다.
 * 
 * */
public class InputStreamReaderTest {

	public static void main(String[] args) throws IOException{
		//String fname= "C:\\myjava\\4조자바2.txt";
		String fname="src/day13/InputStreamTeset2.java";
		File file=new File(fname);//파일 크기 알아볼때
		long fsize=file.length();//파일의 크기를 반환한다.
		System.out.println("파일크기:" +fsize+"bytes");
		
		//FileReader fr=new FileReader(file);
		FileInputStream fis= new FileInputStream(file);
		InputStreamReader fr=new InputStreamReader(fis,"UTF-8");
		
		OutputStreamWriter ow=new OutputStreamWriter(System.out,"UTF-8");
		
		int n=0;
		while ((n=fr.read())!=-1) {
			ow.write(n);
			ow.flush();
			
			//System.out.write(n);
			//System.out.flush();
			
		}
		fr.close();	

	}

}
