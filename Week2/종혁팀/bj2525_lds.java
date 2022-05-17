import java.util.Scanner;

public class bj2525_lds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
