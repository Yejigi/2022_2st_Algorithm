
import java.util.Scanner;
public class bj1000_lsj_java {
	public static int[] input_val() {
		Scanner input = new Scanner(System.in);
		int[] val= {input.nextInt(),input.nextInt()};
		input.close();
		return val;
	}
	public static int adder(int a,int b) {
		return a+b;
	}
	public static boolean validation_check(int a,int b) {
		if(a<=0 || b>=10) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val=input_val();
		if(validation_check(val[0], val[1])) {
			int result=adder(val[0],val[1]);
			System.out.println(result);
		}
	}
}
