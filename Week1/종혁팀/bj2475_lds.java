package Week1.7팀;
//종혁 : 고생하셨습니다.
import java.util.Scanner;

public class bj2475_lds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 5;
		int anwer = 0;
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			anwer += a*a;
		}
		
		System.out.println(anwer%10);
	}
}