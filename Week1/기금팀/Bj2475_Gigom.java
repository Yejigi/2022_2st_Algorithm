package ComonW5;
import java.util.Scanner;

public class Bj2475_Gigom { // 성재 : 완벽깔끔한 코드네요 고생하셨습니다!
	public static void result() {	//민규 : 수고하셨습니다! 코드 참고해서 많이 배우겠습니다!!
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			sum += n*n;
		}
		sc.close();
		int a = sum % 10;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		result();
	}

}
