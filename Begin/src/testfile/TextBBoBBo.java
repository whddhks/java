package testfile;
import java.util.*;
public class TextBBoBBo {
//입력해서 차례대로 검사해서 숫자가 안ㄴ것들 찾아서 출력
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("숫자를 입력하시오");
        String value=sc.next();
        System.out.println(value);
        char ch=' ';
        int k=value.length();
        for (int i=0;i<k;i++) {
            ch=value.charAt(i);
            
            if(ch>='0' && ch<='9') {
                System.out.println("'"+ch+"' 은/는 숫자입니다.");
            }else if ((ch>='a' &&ch<='z')||(ch>='A'&&ch<='Z')){
                System.out.println("'"+ch+"' 은/는 알파벳입니다.");
            }else
                System.out.println("'"+ch+"' 은/는 그이외의 문자입니다.");
        }
        
    }

}
