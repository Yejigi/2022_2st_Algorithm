package Week1;
import java.util.Scanner;
public class BJ_2525_JDH {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a= in.nextInt();//시
        int b= in.nextInt();//분
        int c= in.nextInt();//추가할 분

        int all=(a*60)+b+c;//시간을 분으로 환산

        a=all/60;
        b=all%60;
        if(a>23){
            a=a-24;
        }
        System.out.println(a+" "+b);
    }

}
