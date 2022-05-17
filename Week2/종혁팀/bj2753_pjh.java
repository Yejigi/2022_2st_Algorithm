package baekjoon;
import java.util.Scanner;
public class bj2753_pjh {
	public static void main(String[] args) {
		Scanner ex = new Scanner(System.in);
		
		int year = ex.nextInt();
		
		if(year%4==0) {
			if(year%100!=0||year%400==0) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
		else {
			System.out.println(0);
		}
	}

}
