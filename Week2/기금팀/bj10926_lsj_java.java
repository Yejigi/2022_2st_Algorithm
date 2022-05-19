
import java.util.Scanner;
public class bj10926_lsj_java {
	public static String input() {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		input.close();
		return str;
	}
	public static String concat(String str) {
		return str.concat("??!");
	}
	public static void main(String[] args) {
		System.out.println(concat(input()));
	}
}
