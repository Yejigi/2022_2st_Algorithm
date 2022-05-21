
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ex = new Scanner(System.in);
		
		int A = ex.nextInt();
		int B = ex.nextInt();
		int C = ex.nextInt();
		
		int total = B+C;	
		while(total>=60) {
				total = total - 60;
		        A++;
        }
        
		if(A>=24) {
			A = A-24;
		}
		
		System.out.print(A+" " + total);
		}