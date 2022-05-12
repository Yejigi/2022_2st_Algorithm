
import java.util.Scanner;
import java.math.BigInteger; // LONG 자료형보다 큰 수를 받기 위해 반드시 BigInteger 필요
public class bj13277_lsj_java {
	public static BigInteger[] input_val() {
		Scanner input = new Scanner(System.in);
		BigInteger[] val= {
				input.nextBigInteger(),
				input.nextBigInteger(),
		};
		input.close();
		return val;
	}
	public static BigInteger multiple(BigInteger[] val) { //BigInteger의 곱셈을 위해서는 BigInteger.multiply(BigInteger)필요
		BigInteger Result = val[0].multiply(val[1]);
		return Result;
	}
	public static void main(String[] args) {
		BigInteger[] val=input_val();
		System.out.println(multiple(val));
	}
}
