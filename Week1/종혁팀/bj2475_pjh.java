import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
	
		Scanner ex = new Scanner(System.in);
		int [] scores = new int [5];
		int sum = 0;
		
		for (int i=0; i<scores.length;i++) {
			scores[i] = ex.nextInt();
			}
		for (int j =0; j<scores.length; j++) {
			sum += scores[j]*scores[j];
		}
		int result = sum%10;
		System.out.println(result);
	}
}
