import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		
		int all=(a*60)+b+c;
		
		int d=all%60;//분
		int f=all/60;//시간
		
		
		if (f>23) {
			f=f-24;
		}
		System.out.println(f+" "+d);
	}
}
