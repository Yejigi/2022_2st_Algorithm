import java.util.Scanner;

public class bj1550_jyj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String HexDecimal = sc.next();
		
		int decimal = Integer.parseInt(HexDecimal,16);
		System.out.println(decimal);
		
	}

}
