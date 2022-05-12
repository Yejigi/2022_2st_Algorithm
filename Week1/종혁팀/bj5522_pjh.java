package day1;
import java.util.Scanner;

public class Bj_5522 {
	public static void main(String[] args) {
		Scanner ex = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;

		for(int i =0; i<scores.length; i++) {
			scores[i] = ex.nextInt();
		}
		for(int i =0; i<scores.length; i++) {
			if(scores[i]<0&&scores[i]>10) {
				System.out.println("오류이다.");
			}
			else {
				sum+=scores[i];
			}
		}
		System.out.println(sum);
		ex.close();
	}

}
