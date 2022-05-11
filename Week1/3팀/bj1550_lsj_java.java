
import java.util.Scanner;
public class bj1550_lsj_java {
	public static String hex_input() {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
		return str;
	}
	public static int hex_to_dec(String str) {
		int result=Integer.parseInt(str,16);
		return result;
	}
	public static void main(String[] args) {
		String str=hex_input();
		System.out.println(hex_to_dec(str));
	}
}
