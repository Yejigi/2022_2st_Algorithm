import java.util.Scanner;

public class bj5522_kmg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			input = sc.nextInt();
			sum += input;
		}
		sc.close();
		
		System.out.println(sum);

	}

}
