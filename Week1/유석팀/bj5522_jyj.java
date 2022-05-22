import java.util.Scanner;

public class bj5522_jyj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < 5; i++ ) {
			int score = sc.nextInt();
			if(score >= 0 && score <= 100) {
				sum += score;
			}
		}
		System.out.println(sum);
		
	}

}
