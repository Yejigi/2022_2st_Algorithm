package week2;

import java.util.Scanner;

public class num_1 {

	public static void main(String[] args) {
		// 윤년 2753번
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		
		if(year % 4 == 0) {
			if(year % 400 == 0) {
			System.out.println("1");
			} else if(year % 100 == 0) 
				System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");

	}

}
