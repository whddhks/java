package day11;
import java.io.*;
import java.util.*;
/*Properties : Map계열
 *  - 시스템의 설정정보등을 xxx.properties(확장자) 파일에 저장한 뒤에,
 * 		이 파일을 읽어서 해당 파일에 저장된 내용을 사용하고자 할깨 이용한다.
 *  - 기본적으로 키랑 벨류값을 저잘한다.
 * */
public class PropertiesTest {

	public static void main  (String[] args) throws FileNotFoundException,IOException {
		String loc="src/day11/mysystem.properties"; //역 슬래쉬는 두개쓴다.\\
		Properties prop= new Properties();
		FileReader fr=new FileReader(loc);//파일 노드 연결
		
		
		prop.load(fr);
		fr.close();
		//properties 파일내용을 읽어서 Properties()객체로 옮겨 저장해 놓는다.
		
		//void setProperties(String key, String value) :저장
		//String gerProperties(String key) : 꺼내기
		String os=prop.getProperty("Os");
		System.out.println("운영체제: "+os);
		
		String dbms=prop.getProperty("DbType");
		System.out.println("DBMS: "+dbms);
		
		System.out.println("user: "+prop.getProperty("DbUser","KIng"));//king은 없으면 나옴
		System.out.println("Password: "+prop.getProperty("DbPwd"));
		System.out.println("Msg: "+prop.getProperty("Msg","메세지는 없습니다."));

	}

}
