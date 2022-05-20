
import java.util.Scanner;
public class bj10926_lsj_java {
	public static String input() {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		input.close();
		return str;
	}
	public static String concat(String str) {
		return str.concat("??!"); 				//기곰: concat이 있었네요 ㅋㅋㅋ 상상도 못했었는데 ㄴㅇㄱ 고생하셨습니다! :D
	}
	public static void main(String[] args) {
		System.out.println(concat(input()));
	}
}
