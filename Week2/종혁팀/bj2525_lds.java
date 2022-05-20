import java.util.Scanner;
//종혁 : 고생하셨습니다. 코드가 굉장히 가독성이 좋습니다.
public class bj2525_lds {

	public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				int Sc = in.nextInt();
				int Sm = in.nextInt();
				int M = in.nextInt();
				
				Sm = Sm + M;
				while(Sm >= 60) {
					Sm = Sm - 60;
					Sc++;
				}
				if(Sc >= 24) {
					Sc = Sc - 24;
				}
				
				System.out.println(Sc + " " + Sm);

			}
	}
