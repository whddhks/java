package testfile;
import java.util.*;
public class Nana {
//거스름돈 내기 500 100 50 10 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("가격을 적으시오");
        int take=sc.nextInt();
        
        System.out.println("낸돈을 적으시오");
        int give=sc.nextInt();
        int rem=give-take;
        System.out.println("거스름돈= "+rem);
        int[] coin={5000,1000,500,100,50,10};
        int k=coin.length;
        for (int i=0;i<k;i++) {
            int count=rem/coin[i];
            System.out.println(coin[i]+"원 :"+count+"개");
            rem=rem%coin[i];
        }
        
        
    }

}
