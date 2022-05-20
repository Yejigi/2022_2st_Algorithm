import java.util.Scanner;

public class bj2753_lds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		in.close();
		
		if (A%4 == 0 && A%100 != 0 || A%400 == 0) {
			System.out.println("1");
		} else System.out.println("0");
	}
}
// 종혁 : 고생하셨습니다. 중첩 if문을 활용하지 않고 하나의 if문으로 만드는 코드 배워갑니다.